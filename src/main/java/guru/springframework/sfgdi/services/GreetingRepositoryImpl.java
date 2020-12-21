package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

/**
 * Created by Tom - 21.12.2020
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository{
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {
        return  "Primärer Grußdienst";
    }
}
