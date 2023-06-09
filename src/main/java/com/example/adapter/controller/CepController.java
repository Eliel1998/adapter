package com.example.adapter.controller;

import com.example.adapter.model.Endereco;
import com.example.adapter.service.CepService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/busca-cep")
public class CepController {

    private final CepService cepService;

    public CepController(CepService cepService) {
        this.cepService = cepService;
    }


    @GetMapping("{cep}")
    public Endereco buscaEndereco(@PathVariable String cep) {
        return cepService.buscaEndereco(cep);
    }
}
