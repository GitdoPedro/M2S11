package com.example.M2S11.controllers;

import com.example.M2S11.dtos.getRequests.QuizGetRequest;
import com.example.M2S11.dtos.requests.QuizRequest;
import com.example.M2S11.dtos.responses.QuizResponse;
import com.example.M2S11.models.Quiz;
import com.example.M2S11.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/quizzes")
public class QuizController {
    @Autowired
    private QuizService service;


    @GetMapping("/{id}") //Devemos ter também endpoits GET para retornar: (O Quiz por ID utilize path parameters
    public ResponseEntity<QuizResponse> getQuizById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getQuizById(id));
    }

    /* Crie endpoints de método GET que realizem as listagens: Todas os Quizzes */
    @GetMapping
    public ResponseEntity<List<QuizResponse>> getAllQuiz() {
        return ResponseEntity.ok(service.getAllQuiz());
    }

    @PostMapping
    public ResponseEntity<String> criaQuiz(@RequestBody Quiz quiz) {
        return service.cadastraQuiz(quiz);
    }

    @PutMapping("/atualiza")
    public ResponseEntity<String> atualizaQuizPorId(@RequestParam Integer id, @RequestBody @Validated QuizRequest quiz) {
        return service.atualizaQuizPorId(id, quiz);
    }

    @DeleteMapping("/deleta/{id}")
    public ResponseEntity<String> deletaQuizPorId(@PathVariable Integer id) {
        return service.deletaQuizPorId(id);
    }

}


