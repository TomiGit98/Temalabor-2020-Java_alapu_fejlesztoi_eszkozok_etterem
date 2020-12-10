package onlinerestaurant.repository;

import onlinerestaurant.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    public Category findByNameIgnoreCase(String name);
    public Category findById(long id);
    public List<Category> findAll();

}
