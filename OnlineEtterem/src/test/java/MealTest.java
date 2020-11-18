import onlinerestaurant.OnlineRestaurantApplication;
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

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OnlineRestaurantApplication.class)
@AutoConfigureTestDatabase
@Transactional
public class MealTest {

    @Autowired
    InitDataService initDataService;

    @Autowired
    MealRepository mealRepository;

    @Autowired
    MealService mealService;

    @Before
    public void init() {
        initDataService.init();
    }


    @Test
    public void testFindByName() {
        Pizza pizza = (Pizza) mealRepository.findByName("Pizza");
        assertTrue(pizza!=null);
    }

}
