package controller;

import dto.PeopleDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PeopleService;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class PeopleController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PeopleService peopService;

    @GetMapping(value="/birthdays")
    public List<PeopleDTO> currentBdays(){
        Date today = new Date();
        return peopService.getListOfBirthdays(today.toString());
    }

//    need to include add , edit, delete and show individual birthdays
}
