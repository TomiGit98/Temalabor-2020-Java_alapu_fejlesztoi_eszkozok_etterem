import onlinerestaurant.OnlineRestaurantApplication;
import onlinerestaurant.model.Category;
import onlinerestaurant.repository.CategoryRepository;
import onlinerestaurant.service.InitDataService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OnlineRestaurantApplication.class)
@Transactional
public class CategoryTest {

    @Autowired
    InitDataService initDataService;

    @Autowired
    CategoryRepository categoryRepository;

    @Before
    public void init() {
        initDataService.init();
    }

    @Test
    public void testCategoryByName() {
        Category c = categoryRepository.findByName("Pizzas");
        assertTrue(!c.getAllMeals().isEmpty());
        ;
    }

    @Test
    public void testCategoryById() {
        Category c = categoryRepository.findById(5);
        assertTrue(c.GetId() == 5);
    }
}
