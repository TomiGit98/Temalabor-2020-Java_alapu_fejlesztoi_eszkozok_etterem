package onlinerestaurant.repository;

import onlinerestaurant.model.Category;

import java.util.List;

public interface CategoryRepository {
    public List<Category> findByCategoryName(Category category);

}
