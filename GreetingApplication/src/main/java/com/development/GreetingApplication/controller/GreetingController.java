package com.development.GreetingApplication.controller;
import com.development.GreetingApplication.Greeting;
import com.development.GreetingApplication.service.GreetingService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @PostMapping("/save")
    public Greeting saveGreeting(@RequestParam String message) {
        return greetingService.saveGreeting(message);
    }
}

