package onlinerestaurant.service;

import lombok.Getter;
import onlinerestaurant.model.Category;
import onlinerestaurant.model.Person;
import onlinerestaurant.model.meals.Pancake;
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

    public void init() {
        Person jI = new Person("Ivan", "Jabak", "jakabi" ,"jabaki@gmail.com","pizza utca 1");
        /*Person testUser = new Person("TestFirstName", "TestSurName", "testpassword" ,"test@example.com","Budapest, XI.kerület Fő út 20.");*/
        Category pizzas = new Category("Pizzák");
        Category desserts = new Category("Desszertek");
        Pizza szalamisPizza = new Pizza(
                "Szalámis Pizza",
                2990,
                "https://previews.123rf.com/images/denisenkomax/denisenkomax1511/denisenkomax151100046/48743641-delicious-fresh-salami-pizza-served-on-wooden-table-ideal-for-advertisment.jpg",
                pizzas,
                "Salami");
        Pancake csokiPalacsinta = new Pancake(
                "Csokis Palacsinta",
                990,
                "https://amyinthekitchen.com/wp-content/uploads/2019/02/gluten-free-chocolate-pancakes-2.jpg",
                desserts,
                "Csokoládé szirup");
        pizzas.getAllMeals().add(szalamisPizza);
        desserts.getAllMeals().add(csokiPalacsinta);
        personRepository.save(jI);
        categoryRepository.save(pizzas);
        categoryRepository.save(desserts);
        mealRepository.save(csokiPalacsinta);
        mealRepository.save(szalamisPizza);
    }
}
