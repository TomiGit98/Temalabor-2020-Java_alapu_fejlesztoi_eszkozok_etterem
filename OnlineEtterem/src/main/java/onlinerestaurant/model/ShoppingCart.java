package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {

    private Map<Meal, Integer> meals = new HashMap<>();

    public ShoppingCart(Map<Meal, Integer> meals) {
        this.meals = meals;
    }

    public ShoppingCart() {
    }

    public Map<Meal,Integer> getMeals() {
        return meals;
    }
}
