package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class Meal {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int price;
    private String photoUrl;

    public Meal(String name, int price, String photoUrl, Category category) {
        this.name = name;
        this.price = price;
        this.photoUrl = photoUrl;
        this.category = category;
    }

    @ManyToOne
    private Category category;

    public Meal() {
    }


}
