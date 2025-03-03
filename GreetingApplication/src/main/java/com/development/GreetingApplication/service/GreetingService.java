package com.development.GreetingApplication.service;

import org.springframework.stereotype.Service;
import com.development.GreetingApplication.Greeting;
import com.development.GreetingApplication.repository.GreetingRepository;


@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public Greeting saveGreeting(String message) {
        Greeting greeting = new Greeting(message);
        return greetingRepository.save(greeting);
    }
}
