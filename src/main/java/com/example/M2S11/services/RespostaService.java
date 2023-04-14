package com.example.M2S11.services;

import com.example.M2S11.dtos.getRequests.RespostaGetRequest;
import com.example.M2S11.dtos.responses.QuizResponse;
import com.example.M2S11.dtos.responses.RespostaResponse;
import com.example.M2S11.mappers.RespostaMapper;
import com.example.M2S11.repositories.RespostaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RespostaService {
    @Autowired
    private RespostaRepository repository;

    @Autowired
    private RespostaMapper mapper;

    public RespostaResponse busca(int id) {
        return mapper.map(repository.findById(id).orElseThrow(RuntimeException::new));
    }

    public List<RespostaResponse> busca(RespostaGetRequest requestParams) {

        return mapper.map(repository.findAll());
    }
}
