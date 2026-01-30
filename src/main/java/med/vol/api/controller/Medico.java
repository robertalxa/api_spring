package med.vol.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos") // Mapeia as requisições para /medicos
public class Medico {

    @PostMapping
    public void cadastraMedico(@RequestBody String json) {
        return;
    }
}
