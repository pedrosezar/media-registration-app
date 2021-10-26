package br.edu.utfpr.mediaregistrationapp.model.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "musics")
@Data
@NoArgsConstructor
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private int track;
    @NonNull
    private String title;

    @ManyToOne
    @NonNull
    private Cd cd;

}
