package com.example.shoponline.controller;

import com.example.shoponline.constants.Pages;
import com.example.shoponline.constants.PathConstants;
import com.example.shoponline.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @GetMapping("/products")
    public String getProducts(Model model) {
        var data = _adminService.getProducts();
        model.addAttribute("products", data);
        return Pages.ADMIN_PRODUCTS;
    }

    @GetMapping("/add/perfume")
    public String addPerfume() {
        return Pages.ADMIN_ADD_PERFUME;
    }

}
