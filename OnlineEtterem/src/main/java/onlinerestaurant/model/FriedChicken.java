package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FriedChicken extends MainDish {
    private final List<String> contains;

    public FriedChicken(List<String> contains, MainDishTypes type) {
        super(type);
        this.contains = contains;
    }
}
