package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Person {
    @Id
    @GeneratedValue
    private int ID;

    private String firstname;
    private String surename;
    private String password;
    private String email;
    private String address;

    public Person(String firstname, String surename, String password, String email, String address){
        this.firstname = firstname;
        this.surename = surename;
        this.password = password;
        this.email = email;
        this.address = address;
    }
}
