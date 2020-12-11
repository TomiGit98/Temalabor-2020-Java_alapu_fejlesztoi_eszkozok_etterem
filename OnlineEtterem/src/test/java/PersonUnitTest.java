import onlinerestaurant.model.Person;
import onlinerestaurant.repository.PersonRepository;
import onlinerestaurant.service.PersonService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class PersonUnitTest {

    @InjectMocks
    PersonService personService;

    @Mock
    PersonRepository personRepository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getAllPerson(){
        List<Person> list = new ArrayList<Person>();
        Person p1 = new Person("firstName1", "sureName1", "password1", "email@email1", "address1");
        Person p2 = new Person("firstName2", "sureName2", "password2", "email@email2", "address2");
        Person p3 = new Person("firstName3", "sureName3", "password3", "email@email3", "address3");
        list.add(p1);
        list.add(p2);
        list.add(p3);

        when(personRepository.findAll()).thenReturn(list);

        List<Person> personList = personService.getAllPerson();
        assertThat(3).isEqualTo(personList.size());
    }

    @Test
    public void getEmployeeById(){
        Person p1 = new Person("firstName1", "sureName1", "password1", "email@email1", "address1");
        when(personRepository.findById(1)).thenReturn(p1);

        Person p = personRepository.findById(1);
        assertThat(0).isEqualTo(p.getId());
    }

    @Test
    public void getEmployeeByName(){
        Person p1 = new Person("firstName1", "surName1", "password1", "email@email1", "address1");
        when(personRepository.findByFirstName("firstName1")).thenReturn(p1);

        Person test = personRepository.findByFirstName("firstName1");

        assertThat("firstName1").isEqualTo(test.getFirstName());
        assertThat("surName1").isEqualTo(test.getSurName());
        assertThat("password1").isEqualTo(test.getPassword());
        assertThat("email@email1").isEqualTo(test.getEmail());
        assertThat("address1").isEqualTo(test.getAddress());
    }

    @Test
    public void addNewUser(){
        Person p1 = new Person("firstName1", "sureName1", "password1", "email@email1", "address1");
        when(personRepository.save(p1)).thenReturn(p1);

        personRepository.save(p1);

        verify(personRepository, times(1)).save(p1);
    }
}
