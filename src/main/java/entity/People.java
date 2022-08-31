package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class People {
    @Id
    private int id;
    private String name;
    private int age;
    private String date;
    private String imgUrl;

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
        this.age = age;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return id == people.id && age == people.age && name.equals(people.name) && date.equals(people.date) && imgUrl.equals(people.imgUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, date, imgUrl);
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", date='" + date + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
