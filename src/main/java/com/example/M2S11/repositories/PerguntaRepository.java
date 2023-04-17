package com.example.M2S11.repositories;

import com.example.M2S11.models.Pergunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerguntaRepository extends JpaRepository<Pergunta, Integer> {

    @Query("SELECT p FROM Pergunta p WHERE p.quiz.id = :id_quiz")
    List<Pergunta> findPerguntaByQuiz(Integer id_quiz);





}