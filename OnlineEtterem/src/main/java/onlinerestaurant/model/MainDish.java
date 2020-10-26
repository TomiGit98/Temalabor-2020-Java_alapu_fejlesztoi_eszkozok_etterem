package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MainDish extends Meal {
    private final MainDishTypes type;

    public MainDish(MainDishTypes type) {
        this.type = type;
    }
}
