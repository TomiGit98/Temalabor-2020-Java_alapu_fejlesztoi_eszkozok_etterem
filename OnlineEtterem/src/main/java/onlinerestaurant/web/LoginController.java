package onlinerestaurant.web;

import lombok.RequiredArgsConstructor;
import onlinerestaurant.model.Person;
import onlinerestaurant.repository.PersonRepository;
import onlinerestaurant.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("/login")
public class LoginController {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    PersonService personService;

    @GetMapping
    String loginGet(Map<String, Object> model){
        model.put("loginPerson", new Person());
        return "login";
    }

    @PostMapping
    public String loginPost(Person person, Map<String, Object> model){
        Person personByEmail = personRepository.findByEmail(person.getEmail());
        if(personByEmail != null){
            System.out.println("Person found by id: " + person.getEmail());
            if(personByEmail.getPassword().equals(person.getPassword())){
                return "index";
            }
        }
        System.out.println("Not found: " + person.getEmail());
        return "redirect:/login";
    }
}
