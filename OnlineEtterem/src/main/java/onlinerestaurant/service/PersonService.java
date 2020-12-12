package onlinerestaurant.service;

import onlinerestaurant.model.Person;
import onlinerestaurant.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    @Transactional
    public boolean addNewUser(String firstname, String surename, String password, String email, String address){
        Person p = personRepository.findByEmail(email);
        if(p == null){
            Person person = new Person(firstname, surename, password, email, address);
            personRepository.save(person);
            return true;
        }else{
            return false;
        }
    }

    @Transactional
    public void deleteUser(String surName, String firstName){
        Person p = personRepository.findByFirstName(firstName);
        if(p != null)
            personRepository.delete(p);
    }

    @Transactional
    public void updateUser(Person p, Person p2){
        Person person = personRepository.findByFirstName(p.getFirstName());
        if(person != null) {
            personRepository.delete(p);
            personRepository.save(p2);
        }
    }

    @Transactional
    public List<Person> getAllPerson(){
        return personRepository.findAll();
    }
}
