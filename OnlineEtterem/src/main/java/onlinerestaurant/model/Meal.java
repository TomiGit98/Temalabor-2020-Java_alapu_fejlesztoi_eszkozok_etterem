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
}
