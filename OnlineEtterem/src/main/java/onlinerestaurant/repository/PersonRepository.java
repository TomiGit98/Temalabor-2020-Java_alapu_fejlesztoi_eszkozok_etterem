package onlinerestaurant.repository;

import onlinerestaurant.model.Category;
import onlinerestaurant.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PersonRepository extends JpaRepository<Person, Long> {
    public Person findByFirstName(String firstName);
    public Person findByEmail(String email);
    public Person findById(int id);
    public Person save(Person person);
    public void delete(Person person);
    public List<Person> findAll();
}
