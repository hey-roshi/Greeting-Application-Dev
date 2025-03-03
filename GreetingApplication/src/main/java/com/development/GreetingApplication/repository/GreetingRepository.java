package com.development.GreetingApplication.repository;

import com.development.GreetingApplication.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}
