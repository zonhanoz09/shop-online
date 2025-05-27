package com.example.shoponline.controller;

import com.example.shoponline.constants.Pages;
import com.example.shoponline.constants.PathConstants;
import com.example.shoponline.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(PathConstants.ADMIN)
@RequiredArgsConstructor
public class AdminController {

    private final AdminService _adminService;

    @GetMapping("/perfumes")
    public String getPerfumes(Model model) {
        //controllerUtils.addPagination(model, adminService.getPerfumes(pageable));
        var data = _adminService.getPerfumes();
        model.addAttribute("perfumes", data);
        return Pages.ADMIN_PERFUMES;
    }

    @GetMapping("/add/perfume")
    public String addPerfume() {
        return Pages.ADMIN_ADD_PERFUME;
    }
}
