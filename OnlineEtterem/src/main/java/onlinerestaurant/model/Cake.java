package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Cake extends Dessert {
  private String flavor;

  public Cake(String name, int price, Category category, List<String> allergens, String flavor) {
    super(name, price, category, allergens);
    this.flavor = flavor;
  }
}
