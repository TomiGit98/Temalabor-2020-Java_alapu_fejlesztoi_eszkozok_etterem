package onlinerestaurant.service;

import lombok.Getter;
import onlinerestaurant.model.Category;
import onlinerestaurant.model.Person;
import onlinerestaurant.model.meals.Pizza;
import onlinerestaurant.repository.CategoryRepository;
import onlinerestaurant.repository.MealRepository;
import onlinerestaurant.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Service
public class InitDataService {

    private final MealRepository mealRepository;
    private final CategoryRepository categoryRepository;
    private final PersonRepository personRepository;

    @Autowired
    public InitDataService(MealRepository mealRepository, CategoryRepository categoryRepository, PersonRepository personRepository) {
        this.mealRepository = mealRepository;
        this.categoryRepository = categoryRepository;
        this.personRepository = personRepository;

    }

    public void init(){
        Person jI = new Person("Ivan", "Jabak", "jakabi" ,"jabaki@gmail.com","pizza utca 1");
        Category foEtel = new Category("Pizzas");
        Pizza pizza = new Pizza("Pizza", 2990, foEtel,"Salami");
        foEtel.getAllMeals().add(pizza);
        personRepository.save(jI);
        categoryRepository.save(foEtel);
        mealRepository.save(pizza);
    }
}
