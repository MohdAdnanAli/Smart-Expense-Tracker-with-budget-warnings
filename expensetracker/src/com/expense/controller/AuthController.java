package com.expense.controller;

import com.expense.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public boolean login(@RequestParam String username, @RequestParam String password) {
        return authService.validateUser(username, password);
    }
}
