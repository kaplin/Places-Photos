package com.webapp.placeandphoto.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class WebController {

    @GetMapping("/")
    public String greeting(Map<String, Object> model) {
        return "mainPage.html";
    }

    @GetMapping("/main")
    public String mainPage(Model model) {
        return "mainPage.html";
    }

}

