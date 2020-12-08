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
    InitDataService initDataService;

    @Autowired
    PersonRepository personRepository;

    @Autowired
    PersonService personService;

    @Before
    public void init(){
        initDataService.init();
    }

    @Test
    public void testRepo(){

        Person jakabIvan = personRepository.findByFirstName("Ivan");
        assertTrue(jakabIvan.getSurName().equals("Jabak"));
    }

    @Test
    public void testDeleteUser(){
        personService.deleteUser("Jabak","Ivan");
        Person jakabIvan = personRepository.findByFirstName("Ivan");
        assertTrue(jakabIvan == null);
    }
}
