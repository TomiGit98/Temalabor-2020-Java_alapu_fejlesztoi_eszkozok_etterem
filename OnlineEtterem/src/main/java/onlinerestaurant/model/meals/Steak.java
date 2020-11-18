package onlinerestaurant.model.meals;

import lombok.Getter;
import lombok.Setter;
import onlinerestaurant.model.Category;
import onlinerestaurant.model.Meal;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Steak extends Meal {

    private String cooked;

    public Steak(String name, int price, Category category, String cooked) {
        super(name, price, category);
        this.cooked=cooked;
    }

}
