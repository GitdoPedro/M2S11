package com.example.M2S11.mappers;

import com.example.M2S11.dtos.responses.PerguntaResponse;
import com.example.M2S11.models.Pergunta;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PerguntaMapper {

    //Pergunta map(PerguntaRequest source);
    PerguntaResponse map(Pergunta source);
    List<PerguntaResponse> map(List<Pergunta> source);


}
