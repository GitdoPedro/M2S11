package com.example.M2S11.repositories;

import com.example.M2S11.models.Reposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepostaRepository extends JpaRepository<Reposta, Integer> {


}
