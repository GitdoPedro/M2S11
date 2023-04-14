package com.example.M2S11.controllers;


import com.example.M2S11.dtos.getRequests.RespostaGetRequest;
import com.example.M2S11.dtos.responses.RespostaResponse;
import com.example.M2S11.services.RespostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quizzes")
public class RespostaController {

    @Autowired
    private RespostaService service;
    /* Crie endpoints de método GET que realizem as listagens: Todas as Respostas */

    @GetMapping("/{id}")
    public RespostaResponse getResposta(@PathVariable int id) {
        return service.busca(id);
    }
    @GetMapping
    public List<RespostaResponse> getPergunta(RespostaGetRequest requestParams){

        return service.busca(requestParams);
    }
}
