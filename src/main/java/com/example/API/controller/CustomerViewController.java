package com.example.API.controller;

import com.example.API.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CustomerViewController {
    private final CustomerService customerService;

    @GetMapping("customers")
    public String getCustomers(Model model) {
        model.addAttribute("customers", customerService.getCustomers());
        return "customers";
    }
}
