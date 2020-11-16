package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Meal {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int price;
    private Category category;

    public Meal(long id, String name, int price, Category category){

        this.name = name;
        this.price = price;
        this.category = category;
    }
}
