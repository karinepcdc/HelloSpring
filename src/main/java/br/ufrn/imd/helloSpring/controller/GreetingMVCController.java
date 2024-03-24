package br.ufrn.imd.helloSpring.controller;

import br.ufrn.imd.helloSpring.negocio.GreetingServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Karine Piacentini (karine.piacentini.072@ufrn.edu.br)
 * @since 19/03/24
 */

@Controller
public class GreetingMVCController {

    @Autowired
    private GreetingServer greetingServer;
    
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Visitor") String name, Model model) {
        model.addAttribute("greeting", greetingServer.generateGreeting(name));
        return "greetingHome";
    }
}
