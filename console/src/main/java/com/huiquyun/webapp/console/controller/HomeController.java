package com.huiquyun.webapp.console.controller;

import com.huiquyun.webapp.console.service.RemoteIntegralService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
