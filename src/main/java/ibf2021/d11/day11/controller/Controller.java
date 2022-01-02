package ibf2021.d11.day11.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/error")
    public String home() {
        return "error";
    }

}
