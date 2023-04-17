package com.example.M2S11.dtos.requests;

public class PerguntaRequest {

    private String nome;
    private String texto;

    public String getTitulo() {
        return nome;
    }

    public void setTitulo(String titulo) {
        this.nome = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Integer getId_quiz() {
        return id_quiz;
    }

    public void setId_quiz(Integer id_quiz) {
        this.id_quiz = id_quiz;
    }

    private Integer id_quiz;
}
