package com.tianque.xueliang.control;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@EnableAutoConfiguration
public class SwaggerIndex {

    @RequestMapping("/")
    String index() {
        return "clientApi";
    }
}