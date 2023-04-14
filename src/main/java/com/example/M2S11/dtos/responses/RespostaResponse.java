package com.example.M2S11.dtos.responses;

import com.example.M2S11.models.Pergunta;
import jakarta.persistence.OneToOne;

public class RespostaResponse {
    private int id;
    private String texto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Pergunta getPergunta() {
        return pergunta;
    }

    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }

    private Pergunta pergunta;
}
