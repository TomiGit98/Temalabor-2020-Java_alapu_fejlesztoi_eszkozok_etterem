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

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OnlineRestaurantApplication.class)
@Transactional
public class CategoryTest {

    @Autowired
    CategoryRepository categoryRepository;


    @Test
    public void testCategory() {
        Category c = categoryRepository.findByNameIgnoreCase("Pizzas");
        assertTrue(!c.getAllMeals().isEmpty());
    }

    @Test
    public void testAllCategory() {
        List<Category> categories = categoryRepository.findAll();
        assertTrue(!categories.isEmpty());
    }
}
