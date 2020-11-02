package onlinerestaurant.repository;

import onlinerestaurant.model.Person;

public interface PersonRepository {
    public Person findByName(String name);
    public Person findById(int id);
    public void insert(Person person);
    public boolean delete(Person person);
    public boolean updatePersonByID(int id, Person person);
}
