package com.example.M2S11.services;

import com.example.M2S11.dtos.getRequests.QuizGetRequest;
import com.example.M2S11.dtos.responses.PerguntaResponse;
import com.example.M2S11.dtos.responses.QuizResponse;
import com.example.M2S11.mappers.QuizMapper;
import com.example.M2S11.repositories.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class QuizService {
    @Autowired
    private QuizRepository repository;

    @Autowired
    private QuizMapper mapper;

    public QuizResponse busca(int id) {
        return mapper.map(repository.findById(id).orElseThrow(RuntimeException::new));
    }

    public List<QuizResponse> busca(QuizGetRequest requestParams) {

        return mapper.map(repository.findAll());
    }
}
