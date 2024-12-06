package com.expense.service;

import com.expense.entity.User;
import com.expense.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public boolean validateUser(String username, String password) {
        User user = userRepository.findByUserName(username);
        return user != null && user.getPassword().equals(password);
    }
}
