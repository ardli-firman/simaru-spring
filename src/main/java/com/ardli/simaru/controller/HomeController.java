package com.ardli.simaru.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * HomeController
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String showHomeMenu(Model model) {
        model.addAttribute("menu", "home");
        return "home_layout";

    }

    @GetMapping("/login")
    public String showLoginMenu(Model model) {
        model.addAttribute("menu", "login");
        model.addAttribute("aksi", "/doLogin");
        return "home_layout";
    }
}
