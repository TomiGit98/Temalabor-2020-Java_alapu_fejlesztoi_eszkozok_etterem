package onlinerestaurant.repository;

import onlinerestaurant.model.Category;
import onlinerestaurant.model.Meal;
import java.util.List;

public interface MealRepository {
    public List<Meal> findById(int id);
    public List<Meal> findByName(String name);
    public List<Meal> findByCategory(Category category);
}
