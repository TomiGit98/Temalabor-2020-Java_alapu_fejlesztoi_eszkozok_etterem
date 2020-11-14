package onlinerestaurant.repository;

import onlinerestaurant.model.Meal;
import onlinerestaurant.model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    public boolean insert(Meal meal);
    public boolean delete(Meal meal);
    public void pay();
}