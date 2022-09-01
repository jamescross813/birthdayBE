package repository;

import entity.People;
import org.springframework.data.repository.CrudRepository;

public interface PeopleRepsitory extends CrudRepository <People, Long> {

    Iterable<People> findAllByDobIsContaining(String date);
}
