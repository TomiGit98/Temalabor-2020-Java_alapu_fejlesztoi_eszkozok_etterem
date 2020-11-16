package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class CartItem {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Meal meal;

    private int quantity;

    public CartItem(Long id, Meal meal, int quantity) {
        this.id = id;
        this.meal = meal;
        this.quantity = quantity;
    }
}
