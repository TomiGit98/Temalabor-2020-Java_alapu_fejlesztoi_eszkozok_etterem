package onlinerestaurant.service;

import onlinerestaurant.model.Meal;
import onlinerestaurant.repository.MealRepository;
import onlinerestaurant.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ShoppingCartService {

    @Autowired
    MealRepository mealRepository;
    @Autowired
    ShoppingCartRepository shoppingCartRepository;

    @Transactional
    public void addMealToShoppingCart(String name){
        Meal meal = mealRepository.findByName(name);
        shoppingCartRepository.insert(meal);
    }

    @Transactional
    public void deleteMealFromShoppingCart(Meal meal){
        shoppingCartRepository.delete(meal);
    }
}
