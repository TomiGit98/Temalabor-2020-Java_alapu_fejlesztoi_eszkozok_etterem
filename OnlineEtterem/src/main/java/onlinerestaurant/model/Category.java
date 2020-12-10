package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;
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

    @OneToMany(mappedBy = "category")
    private Set<Meal> meals;

    public Category() {
    }

    public Category(String name){
        this.name = name;
    }

    public Category(String name, Set<Meal> meals) {
        this.name = name;
        this.meals = meals;
    }

    public long GetId(){
        return this.id;
    }

    public Set<Meal> getAllMeals(){
        if (this.meals == null)
            this.meals = new HashSet();
        return this.meals;
    }


}
