import onlinerestaurant.model.Category;
import onlinerestaurant.repository.CategoryRepository;
import onlinerestaurant.service.CategoryService;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class CategoryMockitoTest {


    @InjectMocks
    CategoryService categoryService;
    @Mock
    CategoryRepository categoryRepository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAll(){
        List<Category> categories = new ArrayList<>();
        Category pizzas = new Category("Pizzák");
        Category desserts = new Category("Desszertek");
        categories.add(pizzas);
        categories.add(desserts);
        when(categoryRepository.findAll()).thenReturn(categories);
        List<Category> cats = categoryRepository.findAll();
        assertTrue(!cats.isEmpty());
    }

    @Test
    public void testPizzas(){
        Category pizzas = new Category("Pizzák");
        when(categoryRepository.findByNameIgnoreCase("pizzák")).thenReturn(pizzas);
        Category pizza = categoryRepository.findByNameIgnoreCase("pizzák");
        assertTrue(pizza.getAllMeals().isEmpty());
    }

    @Test
    public void testPost(){
        Category pizzas = new Category("Pizzák");
        when(categoryRepository.save(pizzas)).thenReturn(pizzas);
        categoryRepository.save(pizzas);
        verify(categoryRepository, times(1)).save(pizzas);
    }
}
