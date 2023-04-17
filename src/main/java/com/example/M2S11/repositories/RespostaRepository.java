package com.example.M2S11.repositories;

import com.example.M2S11.models.Resposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RespostaRepository extends JpaRepository<Resposta, Integer> {

    @Query("SELECT r FROM Resposta r WHERE r.pergunta.id = :id_pergunta")
    List<Resposta> findRespostaByPergunta(Integer id_pergunta);


}
