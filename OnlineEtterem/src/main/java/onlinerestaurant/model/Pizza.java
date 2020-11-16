package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Pizza extends Meal{

    private String seasoning;
    private int number;

    public Pizza(String name, int price, Category category, String seasoning, int number) {
        super(name, price, category);
        this.seasoning = seasoning;
        this.number = number;
    }
}
