package onlinerestaurant.service;

import onlinerestaurant.model.Person;
import onlinerestaurant.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    @Transactional
    public void addNewUserToTheShop(String firstname, String surename, String password, String email, String address){
        Person person = new Person(firstname, surename, password, email, address);
        personRepository.insert(person);
    }

}
