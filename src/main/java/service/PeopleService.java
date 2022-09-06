package service;

import dto.PeopleDTO;
import entity.People;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PeopleRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PeopleService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PeopleRepository peopleRepo;

    public List<PeopleDTO> getListOfBirthdays(String date){
        List<PeopleDTO> peopDTOs = new ArrayList();
        Iterable<People> peops = peopleRepo.findAllByDobIsContaining(date);
        for(People peop : peops ){
            PeopleDTO peopDTO = new PeopleDTO();
            peopDTO.setAge(peop.getAge());
            peopDTO.setDob(peopDTO.getDob());
            peopDTO.setName(peop.getName());
            peopDTO.setImgURL(peop.getImgURL());
            peopDTO.setId(peop.getId());
            peopDTOs.add(peopDTO);
        }
        return peopDTOs;
    }

}
