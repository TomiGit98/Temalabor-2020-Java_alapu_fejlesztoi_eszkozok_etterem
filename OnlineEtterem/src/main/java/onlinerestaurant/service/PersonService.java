package onlinerestaurant.service;

import onlinerestaurant.model.Person;
import onlinerestaurant.repository.PersonRepository;

public class PersonService {

    PersonRepository personRepository;

    public void addNewUserToTheShop(String firstname, String surename, String password, String email, String address){
        Person person = new Person(firstname, surename, password, email, address);
        personRepository.insert(person);
    }

}
