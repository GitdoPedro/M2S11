package com.example.M2S11.mappers;

import com.example.M2S11.dtos.requests.QuizRequest;
import com.example.M2S11.dtos.responses.QuizResponse;
import com.example.M2S11.models.Quiz;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface QuizMapper {

    Quiz map(QuizRequest source);
    QuizResponse map(Quiz source);
    List<QuizResponse> map(List<Quiz> source);

}
