package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
public class ShoppingCart {
    private int id;
    private Collection<Meal> meals;
}
