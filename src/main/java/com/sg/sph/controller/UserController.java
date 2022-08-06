package com.sg.sph.controller;

import com.sg.sph.entity.UserInfo;
import com.sg.sph.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/verifyEmail/{emailId}")
    boolean verifyEmailExists(@PathVariable String emailId) {
        return userService.getUserData(emailId);
    }

    @PostMapping("/createAccount")
    UserInfo verifyEmailExists(@RequestBody UserInfo userInfo) {
        return userService.saveUserData(userInfo);
    }

    @PostMapping("/existingAccount")
    boolean existingAccount(@RequestBody UserInfo userInfo) {
        return userService.checkExistingAccount(userInfo);
    }

    @PostMapping("/forgotPassword")
    boolean forgotPassword(@RequestBody UserInfo userInfo) {
        return userService.forgotPassword(userInfo);
    }


}
