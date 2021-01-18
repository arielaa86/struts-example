package org.services;


import org.hibernate.Conexion;
import org.interfaces.InterfacePersonService;
import org.models.Person;
import org.springframework.stereotype.Service;

import java.util.List;

public class PersonService implements InterfacePersonService {

    @Override
    public void save(Person person) {

        Conexion.session().saveOrUpdate(person);
        Conexion.commit();

    }

    @Override
    public List<Person> getAll() {

        List<Person>list = Conexion.session().createQuery("from Person").getResultList();
        Conexion.commit();

        return list;
    }


}
