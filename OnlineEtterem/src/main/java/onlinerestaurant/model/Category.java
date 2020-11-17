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
public class Category {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @OneToMany(mappedBy = "category")
    private Collection<Meal> meals;

    public Category() {
    }

    public Category(String name){
        this.name = name;
    }

    public Collection<Meal> getAllMeals(){
        if (this.meals == null)
            this.meals = new ArrayList<>();
        return this.meals;
    }


}
