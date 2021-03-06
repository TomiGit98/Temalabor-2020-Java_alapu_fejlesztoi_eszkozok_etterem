package onlinerestaurant.web;

import lombok.RequiredArgsConstructor;
import onlinerestaurant.model.Person;
import onlinerestaurant.repository.PersonRepository;
import onlinerestaurant.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    PersonService personService;

    @GetMapping
    String registerGet(Map<String, Object> model){
        model.put("newPerson", new Person());
        return "register";
    }

    @PostMapping
    public String registerPost(Person person, Map<String, Object> model){
        boolean success = personService.addNewUser(person.getFirstName(),person.getSurName(), person.getPassword(), person.getEmail(), person.getAddress());
        if(success){
            System.out.println("Sikeres regisztráció!");
            return "redirect:/login";
        }else{
            System.out.println("Sikertelen regisztráció!");
            return "redirect:/register";
        }
    }
}
