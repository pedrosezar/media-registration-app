package br.edu.utfpr.mediaregistrationapp.model.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "cds")
@Data
@NoArgsConstructor
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class Cd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String artist;
    @NonNull
    private String title;
    @NonNull
    private int year;

}
