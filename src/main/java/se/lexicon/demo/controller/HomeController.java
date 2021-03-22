package se.lexicon.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "home";
    }
    @GetMapping("/")
    public String goToIndexPage() {
        return "index";
    }
}
