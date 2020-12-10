package onlinerestaurant.web;

import lombok.RequiredArgsConstructor;
import onlinerestaurant.model.Category;
import onlinerestaurant.model.Meal;
import onlinerestaurant.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping
    public String getAllCategory(Model model){
       List<Category> categories = categoryRepository.findAll();

       model.addAttribute("categories", categories);
     //  model.put("category",new Category());
        return "category";
    }

    @GetMapping(path = "/{category}")
    public Set<Meal> getCategory(@PathVariable(name = "category")String category){
        Set<Meal> meals = new HashSet<>() ;
        categoryRepository.save(new Category("Pizza",meals));
        return categoryRepository.findByNameIgnoreCase(category).getAllMeals();
    }
}
