package onlinerestaurant.repository;

import onlinerestaurant.model.Category;
import onlinerestaurant.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MealRepository extends JpaRepository<Meal, Long> {
    public Meal findById(int id);
    public Meal findByName(String name);
    public List<Meal> findByCategory(Category category);
}
