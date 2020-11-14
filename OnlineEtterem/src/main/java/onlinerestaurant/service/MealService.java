package onlinerestaurant.service;

import onlinerestaurant.model.Category;
import onlinerestaurant.model.Meal;
import onlinerestaurant.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {
    @Autowired
    MealRepository mealRepository;

    public List<Meal> findMealByCategory(Category category){
        List<Meal> meals;
        meals = mealRepository.findByCategory(category);
        return meals;
    }

    public Meal findMealByName(String name){
        Meal meal = mealRepository.findByName(name);
        return meal;
    }

    public Meal findMealById(int id){
        Meal meal = mealRepository.findById(id);
        return meal;
    }


}
