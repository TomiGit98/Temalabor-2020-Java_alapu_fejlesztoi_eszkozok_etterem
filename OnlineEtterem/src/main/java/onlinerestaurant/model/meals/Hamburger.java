package onlinerestaurant.model.meals;

import lombok.Getter;
import lombok.Setter;
import onlinerestaurant.model.Category;
import onlinerestaurant.model.Meal;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Hamburger extends Meal {

    private String seasoning;
    private String meat;

    public Hamburger() {
    }

    public Hamburger(String name, int price, String photoUrl, Category category, String seasoning, String meat) {
        super(name, price, photoUrl, category);
        this.seasoning = seasoning;
        this.meat = meat;
    }
}
