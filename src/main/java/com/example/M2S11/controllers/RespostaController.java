package com.example.M2S11.controllers;


import com.example.M2S11.dtos.getRequests.RespostaGetRequest;
import com.example.M2S11.dtos.responses.RespostaResponse;
import com.example.M2S11.services.RespostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/respostas")
public class RespostaController {

    @Autowired
    private RespostaService service;

    /* Crie endpoints de método GET que realizem as listagens: Todas as Respostas */
    @GetMapping
    public ResponseEntity<List<RespostaResponse>> getRespostas(RespostaGetRequest requestParams){

        return ResponseEntity.ok(service.getRespostas(requestParams));
    }

    @GetMapping("/{id}") ////Devemos ter também endpoits GET para retornar: (A Resposta por ID utilize path parameters
    public ResponseEntity<RespostaResponse> getRespostaById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getRespostaById(id));
    }

}
