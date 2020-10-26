package onlinerestaurant.model;

import java.util.List;

public class Steak extends MainDish {
    private final List<String> contains;

    public Steak(MainDishTypes type, List<String> contains) {
        super(type);
        this.contains = contains;
    }
}
