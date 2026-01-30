package med.vol.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") // Essa anotação mapeia as requisições para /hello
public class HelloController {

    @GetMapping
    public String OlaMundo() {
        return "Revisando rota de get no Spring Boot!";
    }

}
