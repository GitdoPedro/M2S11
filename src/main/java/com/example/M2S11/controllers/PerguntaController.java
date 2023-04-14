package com.example.M2S11.controllers;

import com.example.M2S11.dtos.getRequests.PerguntaGetRequest;
import com.example.M2S11.dtos.responses.PerguntaResponse;
import com.example.M2S11.services.PerguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/perguntas")
public class PerguntaController {
    @Autowired
    private PerguntaService service;
    /* Crie endpoints de método GET que realizem as listagens: Todas as Perguntas */


    @GetMapping("/{id}")
    public PerguntaResponse getProduto(@PathVariable int id) {
        return service.busca(id);
    }
    @GetMapping
    public List<PerguntaResponse> getPergunta(PerguntaGetRequest requestParams){
        return service.busca(requestParams);
    }

}
