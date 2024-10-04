package com.Mega.MegaBox.controller;

import com.Mega.MegaBox.model.UserModel;
import com.Mega.MegaBox.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findUserPin")
    public String getUserPin(
            @RequestParam String userid
    ){
        Optional<UserModel> user = userRepository.findByUsername(userid);
        return user.get().getUser_pin();
    }
}
