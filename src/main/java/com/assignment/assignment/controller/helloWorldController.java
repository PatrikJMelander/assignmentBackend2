package com.assignment.assignment.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Patrik Melander
 * Date: 2021-09-16
 * Time: 12:17
 * Project: assignment
 * Copyright: MIT
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/hello")
public class helloWorldController {
    @GetMapping("/")
    public String index() {
        return "Hej Dan, läget?";
    }
}
