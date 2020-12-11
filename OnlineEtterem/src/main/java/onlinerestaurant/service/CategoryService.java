package onlinerestaurant.service;

import onlinerestaurant.model.Category;
import onlinerestaurant.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.concurrent.CancellationException;

public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public Category findByNameIgnoreCase(String name) {
        Category category = categoryRepository.findByNameIgnoreCase(name);
        return category;
    }

    public Category findById(long id) {
        Category category = categoryRepository.findById(id);
        return  category;
    }

    public List<Category> findAll() {
        List<Category> categories = categoryRepository.findAll();
        return  categories;
    }

    public Category save(Category category){
        categoryRepository.save(category);
        return category;
    }

}
