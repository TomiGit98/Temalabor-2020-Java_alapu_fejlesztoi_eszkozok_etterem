package onlinerestaurant.web;

import lombok.RequiredArgsConstructor;
import onlinerestaurant.model.Meal;
import onlinerestaurant.repository.CategoryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {

    CategoryRepository categoryRepository;

    @GetMapping(path = "/{category}")
    public Set<Meal> getCategory(@PathVariable(name = "category")String category){
        return categoryRepository.findByName(category).getAllMeals();
    }
}
