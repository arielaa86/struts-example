package org.controllers;

import com.opensymphony.xwork2.ActionSupport;
import org.models.Person;
import org.services.PersonService;

public class PersonController extends ActionSupport {

    private Person person;

    public String create() throws Exception{
        return SUCCESS;
    }

    public String show() throws Exception{
        return SUCCESS;
    }


    public String save() throws Exception{

        try {
            new PersonService().save(person);
        }catch (Exception ex){
            return ERROR;
        }

        return SUCCESS;
    }


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}
