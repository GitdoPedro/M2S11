package com.example.M2S11.controllers;

import com.example.M2S11.dtos.getRequests.QuizGetRequest;
import com.example.M2S11.dtos.responses.QuizResponse;
import com.example.M2S11.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quizzes")
public class QuizController {
    @Autowired
    private QuizService service;
    /* Crie endpoints de método GET que realizem as listagens: Todas as Quizzes */

    @GetMapping("/{id}")
    public QuizResponse getQuiz(@PathVariable int id) {
        return service.busca(id);
    }

    @GetMapping
    public List<QuizResponse> getPergunta(QuizGetRequest requestParams){

        return service.busca(requestParams);
    }
}
