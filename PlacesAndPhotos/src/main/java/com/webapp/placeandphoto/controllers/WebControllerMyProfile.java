package com.webapp.placeandphoto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class WebControllerMyProfile {
    @GetMapping("/userPage")
    public String userPage(Map<String, Object> model) {
        return "userPage.html";
    }
}
