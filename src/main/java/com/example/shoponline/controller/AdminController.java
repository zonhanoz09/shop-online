package com.example.shoponline.controller;

import com.example.shoponline.constants.Pages;
import com.example.shoponline.constants.PathConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(PathConstants.ADMIN)
public class AdminController {

    @GetMapping("/perfumes")
    public String getPerfumes() {
        //controllerUtils.addPagination(model, adminService.getPerfumes(pageable));
        return Pages.ADMIN_PERFUMES;
    }

    @GetMapping("/add/perfume")
    public String addPerfume() {
        return Pages.ADMIN_ADD_PERFUME;
    }
}
