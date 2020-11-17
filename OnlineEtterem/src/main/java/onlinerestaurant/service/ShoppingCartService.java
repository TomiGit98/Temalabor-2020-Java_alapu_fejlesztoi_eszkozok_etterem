package onlinerestaurant.service;

import onlinerestaurant.model.Meal;
import onlinerestaurant.model.Person;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartService {
    public void addToCart(Person person, Meal meal, int quantity){
        int count = person.getShoppingCart().getMeals().containsKey(meal) ? person.getShoppingCart().getMeals().get(meal) : 0;
        person.getShoppingCart().getMeals().put(meal, count + quantity);
    }
}
