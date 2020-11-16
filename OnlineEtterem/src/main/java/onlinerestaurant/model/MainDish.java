package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MainDish extends Meal {
    private final String type;

    public MainDish(long id, String name, int price, Category category, String type) {
        super(id, name, price, category);
        this.type = type;
    }
}
