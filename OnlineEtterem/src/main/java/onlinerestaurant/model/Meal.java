package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Meal {
    private long id;
    private String name;
    private int price;
    private Category category;

    public Meal(long id, String name, int price, Category category){
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
}
