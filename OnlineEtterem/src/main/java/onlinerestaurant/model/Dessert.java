package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Dessert extends Meal {
  private List<String> allergens;

  public Dessert(String name, int price, Category category, List<String> allergens) {
    super(name, price, category);
    this.allergens = allergens;
  }
}
