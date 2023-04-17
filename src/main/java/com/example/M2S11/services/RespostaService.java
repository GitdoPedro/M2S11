package com.example.M2S11.services;

import com.example.M2S11.dtos.getRequests.RespostaGetRequest;
import com.example.M2S11.dtos.responses.QuizResponse;
import com.example.M2S11.dtos.responses.RespostaResponse;
import com.example.M2S11.mappers.RespostaMapper;
import com.example.M2S11.repositories.RespostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RespostaService {
    @Autowired
    private RespostaRepository repository;

    @Autowired
    private RespostaMapper mapper;

    public RespostaResponse getRespostaById(int id) {
        return mapper.map(repository.findById(id).orElseThrow(RuntimeException::new));
    }

    public List<RespostaResponse> getRespostas(RespostaGetRequest requestParams) {
        if (requestParams.getPerguntaId() == null) {
            return mapper.map(repository.findAll());
        } else {
            return mapper.map(repository.findRespostaByPergunta(requestParams.getPerguntaId()));
        }
    }
}
