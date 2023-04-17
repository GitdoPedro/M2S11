package com.example.M2S11.dtos.responses;

import com.example.M2S11.models.Pergunta;
import jakarta.persistence.OneToOne;

public class RespostaResponse {
    private Integer id;
    private String texto;

    private Pergunta pergunta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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


}
