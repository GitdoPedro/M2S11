package com.example.M2S11.controllers;


import com.example.M2S11.dtos.getRequests.PerguntaGetRequest;
import com.example.M2S11.dtos.requests.PerguntaRequest;
import com.example.M2S11.dtos.responses.PerguntaResponse;
import com.example.M2S11.models.Pergunta;
import com.example.M2S11.models.Quiz;
import com.example.M2S11.services.PerguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/perguntas")
public class PerguntaController {

    @Autowired
    private PerguntaService service;

    /* Crie endpoints de método GET que realizem as listagens: Todas as Perguntas */
    @GetMapping
    public ResponseEntity<List<PerguntaResponse>> getPerguntas(PerguntaGetRequest requestParams){

        return ResponseEntity.ok(service.getPerguntas(requestParams));
    }


    //Devemos ter também endpoits GET para retornar: (A Pergunta por ID utilize path parameters)
    @GetMapping("/{id}")
    public ResponseEntity<PerguntaResponse> getPerguntaById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getPerguntaById(id));
    }

    @PostMapping
    public ResponseEntity<PerguntaResponse> criarPergunta(
            @RequestBody PerguntaRequest request,
            UriComponentsBuilder uriBuilder) {
        PerguntaResponse pergunta = service.criarPergunta(request);

        URI uri = uriBuilder.path("/perguntas/{id}")
                .buildAndExpand(pergunta.getId()).toUri();

        return ResponseEntity
                .created(uri)
                .body(pergunta);
    }






}