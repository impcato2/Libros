package com.aluracursos.screenmatch.model;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.swing.*;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)

public record Datos(

        @JsonAlias("results") List <DatosLibros> resultados

) {
}
