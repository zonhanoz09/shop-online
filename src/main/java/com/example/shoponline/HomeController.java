package com.example.shoponline;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Chào mừng bạn đến with Spring Boot!");
        return "index"; // Trang HTML sẽ nằm trong thư mục src/main/resources/templates/index.html
    }
}