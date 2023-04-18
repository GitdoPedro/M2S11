package com.example.M2S11.services;


import com.example.M2S11.dtos.requests.QuizRequest;
import com.example.M2S11.dtos.responses.QuizResponse;
import com.example.M2S11.mappers.QuizMapper;
import com.example.M2S11.models.Quiz;
import com.example.M2S11.repositories.QuizRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.List;

@Service
public class QuizService {
    @Autowired
    private QuizRepository repository;

    @Autowired
    private QuizMapper mapper;

    public QuizResponse getQuizById(int id) {
        return  mapper.map(repository.findById(id).orElseThrow(RuntimeException::new));
    }

    public List<QuizResponse> getAllQuiz() {
        return mapper.map(repository.findAll());
    }



    public ResponseEntity<String> cadastraQuiz(Quiz quiz) {
        repository.save(quiz);
        return ResponseEntity.created(URI.create("")).body("Quiz cadastrado com sucesso");
    }

    public Quiz atualizaQuiz(QuizRequest request) {
        Quiz quiz = repository.findById(request.getId()).orElseThrow(EntityNotFoundException::new);

        if (request.getNome() != null && request.getNome().length() > 0) {
            quiz.setNome(request.getNome());
        }
        if (request.getDescricao() != null && request.getDescricao().length() > 0) {
            quiz.setDescricao(request.getDescricao());
        }

        repository.save(quiz);

        return (quiz);
    }

    public ResponseEntity<String> atualizaQuizPorId(Integer id, QuizRequest quiz) {
        Quiz quizAtualizada = repository.getReferenceById(id);
        quizAtualizada.setNome(quiz.getNome());
        quizAtualizada.setDescricao(quiz.getDescricao());
        repository.save(quizAtualizada);

        return ResponseEntity.ok("Quiz atualizado com sucesso!");
    }

    public ResponseEntity<String> deletaQuizPorId(Integer id) {
        repository.deleteById(id);
        return ResponseEntity.ok("Quiz deletado com sucesso");
    }
}

