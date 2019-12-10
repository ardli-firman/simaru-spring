package com.ardli.simaru.controller;

import com.ardli.simaru.repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
        model.addAttribute("aksi", "/do-login");
        return "home_layout";
    }

    @PostMapping("/do-login")
    public String doLogin() {
        return "oke";
    }

    @GetMapping(value = "/test")
    public String test(Model model) {
        return "test";
    }

}
