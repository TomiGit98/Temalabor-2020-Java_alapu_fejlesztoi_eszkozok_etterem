package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Hamburger extends Meal{

    private String seasoning;
    private String meat;

    public Hamburger(String name, int price, Category category, String seasoning, String meat) {
        super(name, price, category);
        this.seasoning = seasoning;
        this.meat = meat;
    }
}
