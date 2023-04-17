package com.example.M2S11.dtos.getRequests;

import com.example.M2S11.models.Pergunta;
import jakarta.persistence.OneToOne;

public class RespostaGetRequest {
    private Integer perguntaId;

    public Integer getPerguntaId() {
        return perguntaId;
    }

    public void setperguntaId(Integer respostaId) {
        this.perguntaId = perguntaId;
    }

}
