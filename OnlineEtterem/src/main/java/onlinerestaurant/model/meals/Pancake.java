package onlinerestaurant.model.meals;

import lombok.Getter;
import lombok.Setter;
import onlinerestaurant.model.Category;
import onlinerestaurant.model.Meal;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Pancake extends Meal {

    private String topping;

    public Pancake() {
    }

    public Pancake(String name, int price, String photoUrl, Category category, String topping) {
        super(name, price, photoUrl, category);
        this.topping = topping;
    }
}
