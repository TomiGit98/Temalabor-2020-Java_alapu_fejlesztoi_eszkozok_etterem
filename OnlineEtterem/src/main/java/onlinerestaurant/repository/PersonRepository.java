package onlinerestaurant.repository;

import onlinerestaurant.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    public Person findByName(String name);
    public Person findById(int id);
    public void insert(Person person);
    public void delete(Person person);
    public boolean updatePersonByID(int id, Person person);
}
