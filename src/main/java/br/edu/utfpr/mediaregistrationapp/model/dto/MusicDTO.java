package br.edu.utfpr.mediaregistrationapp.model.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class MusicDTO {

    @NonNull
    private int track;
    @NonNull
    private String title;

    @NonNull
    private CdDTO cd;

}
