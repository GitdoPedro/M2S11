package com.example.M2S11.services;

import com.example.M2S11.dtos.getRequests.PerguntaGetRequest;
import com.example.M2S11.dtos.responses.PerguntaResponse;
import com.example.M2S11.mappers.PerguntaMapper;
import com.example.M2S11.repositories.PerguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PerguntaService {

    @Autowired
    private PerguntaRepository repository;

    @Autowired
    private PerguntaMapper mapper;

    public PerguntaResponse busca(int id) {
        return mapper.map(repository.findById(id).orElseThrow(RuntimeException::new));
    }

    public List<PerguntaResponse> busca(PerguntaGetRequest requestParams) {

        return mapper.map(repository.findAll());
    }


}
