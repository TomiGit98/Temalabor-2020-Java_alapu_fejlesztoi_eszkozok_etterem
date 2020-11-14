package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.List;

@Getter
@Setter
@Entity
public class Appetizer extends Meal {
    private String consistency;
    private List<String> contain;

    public Appetizer(String name, int price, Category category) {
        super(name, price, category);
    }
}
