package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by Tom - 21.12.2020
 */
@Service
public class GetterGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}
