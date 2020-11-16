package onlinerestaurant.repository;

import onlinerestaurant.model.Category;
import onlinerestaurant.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    public Category findByName(String name);
    public Category findById(long id);

}
