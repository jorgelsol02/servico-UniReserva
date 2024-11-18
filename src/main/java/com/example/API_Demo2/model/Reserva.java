package com.example.API_Demo2.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idSala;

    private Long idAluno;

    private Long quantidade;

    private Date data;

    private Long tempo;

    private Long estado;

}
