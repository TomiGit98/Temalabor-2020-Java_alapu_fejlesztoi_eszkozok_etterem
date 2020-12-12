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
@RequestMapping("/registerUpdate")
public class RegistrationUpdate {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    PersonService personService;

    @GetMapping
    String registerUpdateGet(Map<String, Object> model){
        model.put("newPerson", new Person());
        return "registerUpdate";
    }

    @PostMapping
    public String registerUpdatePost(Person person, Map<String, Object> model){
        Person p = personRepository.findByEmail(person.getEmail());
        if(p != null){
            Person to = new Person(p.getFirstName(), p.getSurName(), person.getPassword(), p.getEmail(), p.getAddress());
            personService.updateUser(p, to);
            System.out.println("Sikeres frissítés!");
            return "redirect:/login";
        }else{
            System.out.println("Sikertelen frissítés!");
            return "redirect:/registerUpdate";
        }
    }
}
