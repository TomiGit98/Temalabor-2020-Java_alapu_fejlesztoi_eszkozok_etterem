package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Pizza extends Meal{

    private String seasoning;

    public Pizza(String name, int price, Category category, String seasoning) {
        super(name, price, category);
        this.seasoning = seasoning;
    }
}
