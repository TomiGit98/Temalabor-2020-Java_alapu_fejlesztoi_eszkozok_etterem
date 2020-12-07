package onlinerestaurant.service;

import onlinerestaurant.model.Category;
import onlinerestaurant.model.Person;
import onlinerestaurant.repository.CategoryRepository;
import onlinerestaurant.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InitDataService2 {
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    PersonRepository personRepository;

    @Transactional
    public void initSampleData() {
        Person person = new Person("firstname", "surname", "password", "email", "address");
        personRepository.save(person);
    }

    /*private void createPerson(String firstName, String surname, String password, String email, String address) {
        Person person = new Person(firstName, surname, password, email, address);
        personRepository.save(person);
    }*/

}
