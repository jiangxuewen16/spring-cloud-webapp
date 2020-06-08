package com.huiquyun.webapp.console.controller;

import com.huiquyun.integral.model.po.User;
import com.huiquyun.webapp.console.service.RemoteIntegralService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class HomeController {
    private final RemoteIntegralService remoteIntegralService;

    public HomeController(RemoteIntegralService remoteIntegralService) {
        this.remoteIntegralService = remoteIntegralService;
    }


    @GetMapping("/user/score/{userId}")
    public Integer userScore(@PathVariable Integer userId) {
        return this.remoteIntegralService.getUserScore(userId);
    }

    @PostMapping("/add/user")
    public User addUser(@RequestBody User user) {
        return this.remoteIntegralService.update(user);
    }
}
