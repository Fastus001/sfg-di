package fastus.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingsService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
