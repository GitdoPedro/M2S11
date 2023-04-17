package com.example.M2S11.dtos.getRequests;

import com.example.M2S11.models.Quiz;
import jakarta.persistence.ManyToOne;

public class PerguntaGetRequest {
    private Integer quizId;

    public Integer getQuizId() {
        return quizId;
    }

    public void setQuizId(Integer quizId) {
        this.quizId = quizId;
    }
}
