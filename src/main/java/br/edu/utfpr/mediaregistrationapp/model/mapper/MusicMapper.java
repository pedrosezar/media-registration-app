package br.edu.utfpr.mediaregistrationapp.model.mapper;

import br.edu.utfpr.mediaregistrationapp.model.domain.Music;
import br.edu.utfpr.mediaregistrationapp.model.domain.Cd;
import br.edu.utfpr.mediaregistrationapp.model.dto.MusicDTO;
import br.edu.utfpr.mediaregistrationapp.model.dto.CdDTO;


public class MusicMapper{

    public MusicMapper getInstance(){
        return new MusicMapper();
    }

    public static Music toEntity(MusicDTO dto){
        Cd cd = CdMapper.toEntity(dto.getCd());
        Music entity = new Music(dto.getTrack(), dto.getTitle(), cd);
        return entity;
    }

    public static MusicDTO toDTO(Music entity){
        CdDTO cdDTO = CdMapper.toDTO(entity.getCd());
        MusicDTO dto = new MusicDTO(entity.getTrack(), entity.getTitle(), cdDTO);
        return dto;
    }

}
