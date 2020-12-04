package fastus.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingsService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
