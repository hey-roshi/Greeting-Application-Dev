package com.development.GreetingApplication.controller;
import com.development.GreetingApplication.Greeting;
import com.development.GreetingApplication.service.GreetingService;
import org.springframework.web.bind.annotation.*;
import com.development.GreetingApplication.GreetingMessage;
import java.util.Optional;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // UC 4 - Save a Greeting
    @PostMapping
    public GreetingMessage createGreeting(@RequestParam String message) {
        return greetingService.saveGreeting(message);
    }

    // UC 5 - Get a Greeting by ID
    @GetMapping("/{id}")
    public Optional<GreetingMessage> getGreetingById(@PathVariable Long id) {
        return greetingService.findGreetingById(id);
    }
}

