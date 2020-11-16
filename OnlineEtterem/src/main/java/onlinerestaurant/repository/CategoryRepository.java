package onlinerestaurant.repository;

import onlinerestaurant.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    public List<Category> findByName(String name);
    public List<Category> findById(long id);
    public List<Category> findByPrice(int price);
}
