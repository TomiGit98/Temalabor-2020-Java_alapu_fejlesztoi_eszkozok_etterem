package onlinerestaurant;

import onlinerestaurant.service.InitDataService;
import onlinerestaurant.service.MealService;
import onlinerestaurant.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineRestaurantApplication implements CommandLineRunner {

  @Autowired
  InitDataService initDataService;

  @Autowired
  MealService mealService;

  @Autowired
  PersonService personService;

  public static void main(String[] args) {
    SpringApplication.run(OnlineRestaurantApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    initDataService.init();
//    shoppingCartService.addMealToShoppingCart("AAA");
//    mealService.findMealByCategory(new Category("AAA"));
//    personService.addNewUserToTheShop("FirstName", "SureName", "Password", "email@email.com", "Budapest");
  }

}
