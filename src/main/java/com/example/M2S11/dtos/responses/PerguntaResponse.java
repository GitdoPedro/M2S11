package com.example.M2S11.dtos.responses;

import com.example.M2S11.models.Quiz;
import jakarta.persistence.ManyToOne;

public class PerguntaResponse {
    private int id;
    private String nome;
    private String texto;
    private Quiz quiz;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }
}
