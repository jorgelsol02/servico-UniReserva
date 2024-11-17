package com.example.API_Demo2.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long cadeiras;

    private Long mesa;

    private Long tamanho;

    private Long numero;

    private String tipo;

}
