package book.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class pageController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
