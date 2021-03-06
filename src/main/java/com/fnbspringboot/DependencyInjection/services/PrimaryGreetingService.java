package com.fnbspringboot.DependencyInjection.services;

import com.fnbspringboot.DependencyInjection.repositories.GreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
/*
    we introduce @Primary to tell the compile that if there
    are more than one Bean then this one will be the most
    preferred.
*/
@Primary
@Profile({"en", "default"})
public class PrimaryGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello, this is a Primary Greeting Service";
    }
}
