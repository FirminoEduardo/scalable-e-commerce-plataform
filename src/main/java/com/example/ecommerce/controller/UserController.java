package com.example.ecommerce.controller;

import com.example.ecommerce.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        // Lógica para adicionar o usuário no banco de dados
        return "Usuário registrado com sucesso!";
    }
}
