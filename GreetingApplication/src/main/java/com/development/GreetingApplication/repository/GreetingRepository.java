package com.development.GreetingApplication.repository;
import com.development.GreetingApplication.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import com.development.GreetingApplication.GreetingMessage;
import org.springframework.stereotype.Repository;


@Repository
public interface GreetingRepository extends JpaRepository<GreetingMessage, Long> {
}

