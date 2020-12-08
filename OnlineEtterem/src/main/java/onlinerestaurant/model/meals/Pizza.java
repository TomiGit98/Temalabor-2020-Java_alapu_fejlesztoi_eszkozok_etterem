package onlinerestaurant.model.meals;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import onlinerestaurant.model.Category;
import onlinerestaurant.model.Meal;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Pizza extends Meal {

    private String seasoning;

    public Pizza() {
        super();
    }

    public Pizza(String name, int price, Category category, String seasoning) {
        super(name, price, category);
        this.seasoning = seasoning;
    }
}
