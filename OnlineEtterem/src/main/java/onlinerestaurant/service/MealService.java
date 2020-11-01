package onlinerestaurant.service;

import onlinerestaurant.model.Category;
import onlinerestaurant.model.Meal;
import onlinerestaurant.repository.CategoryRepository;
import onlinerestaurant.repository.MealRepository;

import java.util.ArrayList;
import java.util.List;

public class MealService {

    MealRepository mealRepository;

    public List<Meal> findMealByCategory(Category category){
        List<Meal> meals = new ArrayList<>();
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
