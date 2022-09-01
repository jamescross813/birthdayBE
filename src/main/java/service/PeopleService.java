package service;

import dto.PeopleDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PeopleRepository;

import java.util.List;

@Service
public class PeopleService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PeopleRepository peopleRepo;

    public List<PeopleDTO> getListOfBirthdays(String date){
        return null;
    }

}
