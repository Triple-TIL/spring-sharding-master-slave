package com.example.sharding.ui;

import com.example.sharding.application.UserService;
import com.example.sharding.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/users")
    public User save() {
        return userService.save();
    }

    @GetMapping("/users/{id}")
    public User getUserId(@PathVariable Long id) {
        return userService.getUser(id);
    }

}
