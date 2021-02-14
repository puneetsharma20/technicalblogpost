package com.puneet.technicalblogpost.controller;

import com.puneet.technicalblogpost.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    //URL : users/login
    @RequestMapping("users/login")
    public String login(Model model){
        model.addAttribute("user",new User());
    }
}
