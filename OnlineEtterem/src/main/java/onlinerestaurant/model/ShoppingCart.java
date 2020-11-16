package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;

@Getter
@Setter
@Entity
public class ShoppingCart {
    @Id
    @GeneratedValue
    private long id;

    @OneToMany(mappedBy = "meals")
    private Collection<Meal> meals;

    public ShoppingCart(){

    }

    public Collection<Meal> getMeals() {
        if (this.meals == null)
            this.meals = new ArrayList<>();

        return this.meals;
    }
}
