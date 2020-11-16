package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Appetizer extends Meal {
    private final String consistency;
    private final List<String> contains;

    public Appetizer(long id, String name, int price, Category category, String consistency, List<String> contains) {
        super(id, name, price, category);
        this.consistency=consistency;
        this.contains = contains;
    }
}
