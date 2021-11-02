package br.edu.utfpr.mediaregistrationapp.model.mapper;

import br.edu.utfpr.mediaregistrationapp.model.domain.Cd;
import br.edu.utfpr.mediaregistrationapp.model.dto.CdDTO;

public class CdMapper {

    public CdMapper getInstance(){
        return new CdMapper();
    }

    public static Cd toEntity(CdDTO dto){
        Cd entity = new Cd(dto.getArtist(), dto.getTitle(), dto.getYear());
        return entity;
    }

    public static CdDTO toDTO(Cd entity){
        CdDTO dto = new CdDTO(entity.getId(), entity.getArtist(), entity.getTitle(), entity.getYear());
        return dto;
    }

}
