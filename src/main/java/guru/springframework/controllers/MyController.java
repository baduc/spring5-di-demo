package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello() {
        return "Hello World";
    }
}
