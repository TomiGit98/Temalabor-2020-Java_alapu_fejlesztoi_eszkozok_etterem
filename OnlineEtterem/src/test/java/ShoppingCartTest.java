import onlinerestaurant.OnlineRestaurantApplication;
import onlinerestaurant.model.Category;
import onlinerestaurant.model.Person;
import onlinerestaurant.model.meals.Pizza;
import onlinerestaurant.repository.CategoryRepository;
import onlinerestaurant.repository.PersonRepository;
import onlinerestaurant.service.InitDataService;
import onlinerestaurant.service.ShoppingCartService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.assertTrue;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OnlineRestaurantApplication.class)
@AutoConfigureTestDatabase
public class ShoppingCartTest {

    @Autowired
    InitDataService initDataService;

    @Autowired
    ShoppingCartService shoppingCartService;

    @Autowired
    PersonRepository personRepository;

    @Autowired
    CategoryRepository categoryRepository;



    @Before
    public void init(){
        initDataService.init();
    }

    @Test
    public void testAddToCart(){
        Person jakabIvan = personRepository.findByFirstName("Ivan");
        Category Pizzas = categoryRepository.findByName("Pizzas");
        Pizza pizza = new Pizza("Hawaii Pizza",2990,Pizzas,"Ananasz");
        shoppingCartService.addToCart(jakabIvan,pizza,3);
        assertTrue(jakabIvan.getShoppingCart().getMeals().get(pizza).intValue() == 3 );
    }
}
