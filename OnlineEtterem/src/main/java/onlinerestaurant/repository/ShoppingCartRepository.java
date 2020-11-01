package onlinerestaurant.repository;

import onlinerestaurant.model.Meal;

public interface ShoppingCartRepository {
    public boolean insert(Meal meal);
    public boolean delete(Meal meal);
}