package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Appetizer extends Meal {
    private String consistency;
    private List<String> contain;
}
