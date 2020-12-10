package onlinerestaurant.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }

    /*@RequestMapping(value = "/register")
    public String register(){
        return "register";
    }*/

    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

}
