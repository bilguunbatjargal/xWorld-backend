package com.backend.xworld.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @GetMapping(value = {"/hellotest"})
    public String sda() {
        return "fuckyu";
    }


}
