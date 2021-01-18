package org.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "person")
public class Person  implements Serializable {

    @Id
    @SequenceGenerator(name = "person_id_sequence")
    @GeneratedValue(generator = "person_id_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "First Name: " + getFirstName() + " Last Name:  " + getLastName() +
                " Email:      " + getEmail() + " Age:      " + getAge() ;
    }

}
