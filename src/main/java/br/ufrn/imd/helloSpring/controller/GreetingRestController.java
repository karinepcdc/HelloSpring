package br.ufrn.imd.helloSpring.controller;

import br.ufrn.imd.helloSpring.negocio.GreetingServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Karine Piacentini (karine.piacentini.072@ufrn.edu.br)
 * @since 19/03/24
 */
@RestController
public class GreetingRestController {
    
    @Autowired
    private GreetingServer greetingServer;

    @GetMapping("/greeting/rest")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Visitor") String name, Model model) {
        
        return String.format("Hello, %s!", greetingServer.generateGreeting(name));
    }
}
