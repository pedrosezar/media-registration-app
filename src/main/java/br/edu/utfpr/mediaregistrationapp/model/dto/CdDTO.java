package br.edu.utfpr.mediaregistrationapp.model.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class CdDTO {

    @NonNull
    private Long id;
    @NonNull
    private String artist;
    @NonNull
    private String title;
    @NonNull
    private int year;

}
