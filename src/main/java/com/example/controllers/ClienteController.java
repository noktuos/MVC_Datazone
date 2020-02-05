package com.example.controllers;

import com.example.models.Cliente;
import com.example.services.ClienteService;
import com.example.utility.UrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping(UrlConstants.CLIENTE)
public class ClienteController {

    @GetMapping("")
    public String goCliente(){
        return "cliente";
    }




}
