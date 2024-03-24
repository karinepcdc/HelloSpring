package br.ufrn.imd.helloSpring.negocio;

import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.Random;

/**
 * @author Karine Piacentini (karine.piacentini.072@ufrn.edu.br)
 * @since 19/03/24
 */

@Component
public class GreetingServer {
    
    private static final String[] greetings = {
            "Hello, %s!",
            "Have a spectacular morning dear %s!",
            "Greetings, %s dear friend! Sending you a virtual hug and lots of positive energy.",
            "Hi %s! Sending you a big smile and lots of good vibes.",
            "Hello there dear %s! May your day be as wonderful as you are.",
            "Hey, %s! Hope your day shines as bright as you do.",
            "Good evening dear %s! Hoping your day was filled with little moments of joy."
    };
    
    public GreetingServer() {}
    
    public String generateGreeting(String name) {
        Random random = new Random(); 
        String capitalized = name.substring(0, 1).toUpperCase(Locale.ROOT) + name.substring(1).toLowerCase();
        
        return String.format(greetings[random.nextInt(greetings.length)], capitalized);
    }
    
}
