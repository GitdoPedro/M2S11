package com.example.M2S11.mappers;

import com.example.M2S11.dtos.responses.RespostaResponse;
import com.example.M2S11.models.Resposta;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RespostaMapper {

    //Resposta map(RespostaRequest source);
    RespostaResponse map(Resposta source);
    Resposta map(RespostaResponse source);
    List<RespostaResponse> map(List<Resposta> source);



}
