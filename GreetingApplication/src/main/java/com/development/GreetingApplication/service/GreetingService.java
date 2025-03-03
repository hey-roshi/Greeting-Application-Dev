package com.development.GreetingApplication.service;
import org.springframework.stereotype.Service;
import com.development.GreetingApplication.Greeting;
import com.development.GreetingApplication.repository.GreetingRepository;
import com.development.GreetingApplication.GreetingMessage;


import java.util.Optional;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingMessage saveGreeting(String message) {
        GreetingMessage greetingMessage = new GreetingMessage(message);
        return greetingRepository.save(greetingMessage);
    }

    public Optional<GreetingMessage> findGreetingById(Long id) {
        return greetingRepository.findById(id);
    }
}
