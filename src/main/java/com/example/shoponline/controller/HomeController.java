package com.example.shoponline.controller;

import com.example.shoponline.constants.Pages;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String home(Model model) {
        model.addAttribute("perfumes", "test");
        return Pages.HOME;
    }

}
