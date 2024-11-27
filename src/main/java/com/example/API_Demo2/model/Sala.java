package com.example.API_Demo2.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long cadeira;

    private Long mesa;

    private String local;

    private Long numero;

    private Long capacidade;

    private Long tomadas;
    
    private String tipo;

}
