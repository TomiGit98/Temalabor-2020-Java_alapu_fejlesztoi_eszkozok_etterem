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
    private int id;

    private final String firstname;
    private final String surename;
    private final String password;
    private final String email;
    private final String address;

    public Person(String firstname, String surename, String password, String email, String address){
        this.firstname = firstname;
        this.surename = surename;
        this.password = password;
        this.email = email;
        this.address = address;
    }

    public String getFirstname(){
        return this.firstname;
    }

    public String getSurename(){
        return this.surename;
    }
}
