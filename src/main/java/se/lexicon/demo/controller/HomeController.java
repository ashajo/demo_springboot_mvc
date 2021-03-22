package se.lexicon.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }
    @GetMapping("/index")
    public String goToIndexPage() {
        return "index";
    }
}
