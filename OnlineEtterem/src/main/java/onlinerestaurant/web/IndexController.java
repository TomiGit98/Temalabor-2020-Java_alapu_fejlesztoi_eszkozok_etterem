package onlinerestaurant.web;

import lombok.RequiredArgsConstructor;
import onlinerestaurant.model.Category;
import onlinerestaurant.model.Meal;
import onlinerestaurant.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
@RequiredArgsConstructor
@RequestMapping("/index")
public class IndexController {


    @GetMapping
    public String getAllCategory(Model model){
        return "index";
    }
}
