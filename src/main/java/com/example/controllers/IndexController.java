package com.example.controllers;


import com.example.utility.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(UrlConstants.INDEX)
public class IndexController {

    @GetMapping(path="")
    public String goIndex(){
        return "index";
    }
}
