package com.example.M2S11.services;

import com.example.M2S11.dtos.getRequests.PerguntaGetRequest;
import com.example.M2S11.dtos.getRequests.QuizGetRequest;
import com.example.M2S11.dtos.requests.PerguntaRequest;
import com.example.M2S11.dtos.responses.PerguntaResponse;
import com.example.M2S11.dtos.responses.QuizResponse;
import com.example.M2S11.mappers.PerguntaMapper;
import com.example.M2S11.models.Pergunta;
import com.example.M2S11.models.Quiz;
import com.example.M2S11.repositories.PerguntaRepository;
import com.example.M2S11.repositories.QuizRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.List;

@Service
public class PerguntaService {

    @Autowired
    private PerguntaRepository repository;
    private QuizRepository quizRepository;

    private QuizService quizService;

    @Autowired
    private PerguntaMapper mapper;

    public PerguntaResponse getPerguntaById(int id) {
        return mapper.map(repository.findById(id).orElseThrow(RuntimeException::new));
    }

    public List<PerguntaResponse> getPerguntas(PerguntaGetRequest requestParams) {
        if (requestParams.getQuizId() == null) {
            return mapper.map(repository.findAll());
        } else {
            return mapper.map(repository.findPerguntaByQuiz(requestParams.getQuizId()));
        }


    }

    public PerguntaResponse criarPergunta(PerguntaRequest perguntaRequest) {
        Pergunta pergunta = repository.save(mapper.map(perguntaRequest));

        return mapper.map(pergunta);
    }
}
