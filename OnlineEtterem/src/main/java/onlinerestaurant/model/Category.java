package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Category {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @OneToMany(mappedBy = "category",fetch = FetchType.EAGER)
    private Set<Meal> meals = new HashSet<>();

    public Category() {
    }

    public Category(String name){
        this.name = name;
    }

    public Category(String name, Set<Meal> meals) {
        this.name = name;
        this.meals = meals;
    }



    public Set<Meal> getAllMeals(){
        return meals;
    }
}
