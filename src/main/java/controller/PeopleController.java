package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import service.PeopleService;

@RestController
@CrossOrigin
public class PeopleController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PeopleService peopService;
}
