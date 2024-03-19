package com.algaworks.awpag.api.controller;

import com.algaworks.awpag.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar(){
        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("Amauri");
        cliente1.setTelefone("89989898");
        cliente1.setEmail("amauri.p.castro@gmail.com");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Ana Claudia");
        cliente2.setTelefone("8989898989");
        cliente2.setEmail("ana.castro@gmail.com");

        return Arrays.asList(cliente1, cliente2);
    }
}