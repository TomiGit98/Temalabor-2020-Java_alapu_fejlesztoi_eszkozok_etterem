package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Soup extends Appetizer{
    private String taste;

    public Soup(String name, int price, Category category) {
        super(name, price, category);
    }
}
