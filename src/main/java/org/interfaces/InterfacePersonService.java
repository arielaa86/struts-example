package org.interfaces;


import org.models.Person;
import java.util.List;

public interface InterfacePersonService{

    void save(Person person);
    List<Person> getAll();

}
