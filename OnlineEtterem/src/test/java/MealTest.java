import onlinerestaurant.OnlineRestaurantApplication;
import onlinerestaurant.model.Category;
import onlinerestaurant.model.Meal;
import onlinerestaurant.model.meals.Pizza;
import onlinerestaurant.repository.MealRepository;
import onlinerestaurant.service.InitDataService;
import onlinerestaurant.service.MealService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.assertTrue;
import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OnlineRestaurantApplication.class)
@AutoConfigureTestDatabase
@Transactional
public class MealTest {

    @Autowired
    MealRepository mealRepository;

    @Autowired
    MealService mealService;

    @Test
    public void testFindByName() {
        Pizza pizza = (Pizza) mealRepository.findByName("Szalámis Pizza");
        assertTrue(pizza != null);
    }

    @Test
    public void testFindById() {
        Pizza pizza = (Pizza) mealRepository.findById(5);
        assertTrue(pizza != null);
        assertTrue(pizza.getId() == 5);
    }

    @Test
    public void testFindByCategoryRepository() {
        Meal meal = mealService.findMealById(5);
        assertTrue(meal != null);
    }

    @Test
    public void testFindByCategoryService() {
        Meal meal = mealService.findMealByName("Szalámis Pizza");
        assertTrue(meal != null);
    }

}
