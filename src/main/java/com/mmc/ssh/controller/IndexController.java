package com.mmc.ssh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class IndexController {

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
}
