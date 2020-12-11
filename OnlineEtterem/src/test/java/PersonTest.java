import onlinerestaurant.OnlineRestaurantApplication;
import onlinerestaurant.model.Person;
import onlinerestaurant.repository.PersonRepository;
import onlinerestaurant.service.InitDataService;
import onlinerestaurant.service.InitDataService2;
import onlinerestaurant.service.PersonService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OnlineRestaurantApplication.class)
//@SpringBootTest
@AutoConfigureTestDatabase
@Transactional
public class PersonTest {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    PersonService personService;


    @Test
    public void testAddUserToRepository(){
        Person test = personRepository.findByFirstName("Ivan");
        assertTrue(test.getSurName().equals("Jabak"));
    }

    @Test
    public void testFindByFirstNameRepository(){
        Person test = personRepository.findByFirstName("Ivan");
        System.out.println("ID: " + test.getId());
        assertTrue(test.getSurName().equals("Jabak"));
    }

    @Test
    public void testFindByIdRepository(){
        Person test = personRepository.findById(1);
        assertTrue(test != null);
        assertTrue(test.getFirstName() == "Ivan");
    }

    @Test
    public void testFindByEmailRepository(){
        Person test = personRepository.findByEmail("jabaki@gmail.com");
        assertTrue(test != null);
        assertTrue(test.getEmail() == "jabaki@gmail.com");
    }

    @Test
    public void testDeleteUserFromRepository(){
        personService.deleteUser("Jabak","Ivan");
        Person test = personRepository.findByFirstName("Ivan");
        assertTrue(test == null);
    }

    @Test
    public void addNewUserService(){
        personService.addNewUser("TestFirstName", "TestSurName", "TestPassword", "TestEmail", "TestAddress");
        Person test = personRepository.findByFirstName("TestFirstName");
        assertTrue(test.getFirstName() == "TestFirstName");
    }

    @Test
    public void deleteUserService(){
        personService.deleteUser("TestSurName", "TestFirstName");
        Person testDeleted = personRepository.findByFirstName("TestFirstName");
        assertTrue(testDeleted == null);
    }

    @Test
    public void updateUserService(){
        personService.addNewUser("TestFirstName", "TestSurName", "TestPassword", "TestEmail", "TestAddress");
        Person from = personRepository.findByFirstName("TestFirstName");
        Person to = new Person("FirstNameChanged", from.getSurName(), from.getPassword(), from.getEmail(), from.getAddress());
        personService.updateUser(from, to);
        Person p = personRepository.findByFirstName("FirstNameChanged");
        assertTrue(p.getFirstName() == "FirstNameChanged" && p.getSurName() == from.getSurName() && p.getPassword() == from.getPassword() && p.getEmail() == from.getEmail() && p.getAddress() == from.getAddress());
    }
}
