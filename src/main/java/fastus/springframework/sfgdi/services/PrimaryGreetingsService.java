package fastus.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingsService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello world - from PRIMARY bean!";
    }
}
