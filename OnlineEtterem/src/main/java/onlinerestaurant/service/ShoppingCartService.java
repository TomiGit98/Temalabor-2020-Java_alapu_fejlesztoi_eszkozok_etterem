package onlinerestaurant.service;

import onlinerestaurant.model.Meal;
import onlinerestaurant.repository.MealRepository;
import onlinerestaurant.repository.ShoppingCartRepository;

public class ShoppingCartService {

    MealRepository mealRepository;
    ShoppingCartRepository shoppingCartRepository;

    public void addMealToShoppingCart(String name){
        Meal meal = mealRepository.findByName(name);
        shoppingCartRepository.insert(meal);
    }

    public void deleteMealFromShoppingCart(Meal meal){
        shoppingCartRepository.delete(meal);
    }
}
