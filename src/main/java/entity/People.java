package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class People {
    @Id
    private int id;
    private String name;
    private int age;
    private String date;
    private String imgUrl;


}
