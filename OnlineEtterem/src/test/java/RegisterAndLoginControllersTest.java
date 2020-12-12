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
public class RegisterAndLoginControllersTest {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    PersonService personService;

    @Test
    public void testPersonRegistrationAndLogin(){
        //Person registration
        Person p = new Person("TestFirstName", "TestSurName", "TestPassword", "TestEmail", "TestAddress");
        boolean success = personService.addNewUser(p.getFirstName(), p.getSurName(), p.getPassword(), p.getEmail(), p.getAddress());
        Person loginEmail = personRepository.findByEmail("TestEmail");
        if(success){
            //Ha sikerült a regisztráció akkor login
            assertTrue(loginEmail != null);
        }else{
            //Ha nem sikerült a regisztráció, akkor nincs login
            assertTrue(loginEmail == null);
        }
    }
}
