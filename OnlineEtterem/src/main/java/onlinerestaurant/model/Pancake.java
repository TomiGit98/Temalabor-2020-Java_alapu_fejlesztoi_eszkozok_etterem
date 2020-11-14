package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Pancake extends Dessert{
  private String filling;

  public Pancake(String name, int price, Category category, List<String> allergens, String filling) {
    super(name, price, category, allergens);
    this.filling = filling;
  }
}
