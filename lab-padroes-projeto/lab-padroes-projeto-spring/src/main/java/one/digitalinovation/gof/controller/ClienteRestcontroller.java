package one.digitalinovation.gof.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinovation.gof.service.ClienteService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("clientes")
public class ClienteRestcontroller {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<Iterable<Cliente>> buscarTodos() {
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping("/{id}")
    public String (@RequestParam String param) {
        return new String();
    }
    
}
