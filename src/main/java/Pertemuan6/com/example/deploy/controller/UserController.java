package Pertemuan6.com.example.deploy.controller;

import Pertemuan6.com.example.deploy.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class UserController {

    static List<User> data = new ArrayList<>();

    // LOGIN PAGE
    @GetMapping("/")
    public String loginPage() {
        return "login";
    }

    // PROSES LOGIN
    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password) {

        if(username.equals("admin") && password.equals("20240140059")) {
            return "redirect:/home";
        }
        return "login";
    }

    // HOME
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("list", data);
        return "home";
    }

    // FORM
    @GetMapping("/form")
    public String form() {
        return "form";
    }

    // SAVE
    @PostMapping("/save")
    public String save(@RequestParam String nama,
                       @RequestParam String nim,
                       @RequestParam String jk) {

        data.add(new User(nama, nim, jk));
        return "redirect:/home";
    }
}