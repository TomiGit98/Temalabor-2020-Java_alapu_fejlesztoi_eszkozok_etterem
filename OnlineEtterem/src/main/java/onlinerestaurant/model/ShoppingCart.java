package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;

@Getter
@Setter
@Entity
public class ShoppingCart {
    @Id
    @GeneratedValue
    private int id;

    private Collection<Meal> meals;

    public ShoppingCart(){}
}
