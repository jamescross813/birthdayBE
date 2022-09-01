package dto;

import entity.People;

import java.util.Date;

public class PeopleDTO {
    int id;
    String name;
    int age;
    String dob;
    String imgURL;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age==0){
            String birthyr = this.dob.toString().substring(0, 3);
            Date today = new Date();
            String thisyr = String.valueOf(today.getYear());
            this.age = Integer.parseInt(thisyr) - Integer.parseInt(birthyr);
        }
        else{
            this.age = age;
        }
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    @Override
    public String toString() {
        return "PeopleDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dob='" + dob + '\'' +
                ", imgURL='" + imgURL + '\'' +
                '}';
    }

    public People createEntity(){
        People peop = new People();
        peop.setId(this.getId());
        peop.setName(this.getName());
        peop.setAge(this.getAge());
        peop.setDob(this.getDob());
        peop.setImgURL(this.getImgURL());

        return peop;
    }

}
