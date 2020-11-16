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
    public void addNewUser(String firstname, String surename, String password, String email, String address){
        Person person = new Person(firstname, surename, password, email, address);
        personRepository.insert(person);
    }

    @Transactional
    public void deleteUser(String surename, String firstname){
        Person p = personRepository.findByName(surename, firstname);
        if(p != null)
            personRepository.delete(p);
    }

    @Transactional
    public void updateUser(Person p, Person p2){
        Person person = personRepository.findByName(p.getSurename(), p.getFirstname());
        if(person != null) {
            personRepository.delete(p);
            personRepository.insert(p2);
        }
    }

}
