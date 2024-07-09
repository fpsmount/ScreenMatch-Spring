package br.com.alura.screenmatch.MODEL;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record dadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias ("totalSeasons")Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {
}
