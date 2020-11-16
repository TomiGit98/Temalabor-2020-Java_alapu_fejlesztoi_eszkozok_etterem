package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Dessert extends Meal {
  private final List<String> allergens;

  public Dessert(long id, String name, int price, Category category, List<String> allergens) {
    super(id, name, price, category);
    this.allergens = allergens;
  }
}
