package main.java;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class InputController {

    @PostMapping("/echo")
    public String echoInput(@RequestBody String input) {
        StringBuilder response = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            response.append(input).append("<br>");
        }
        return response.toString();
    }
}