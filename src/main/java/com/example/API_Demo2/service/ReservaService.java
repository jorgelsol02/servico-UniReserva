package com.example.API_Demo2.service;

import com.example.API_Demo2.model.Reserva;
import com.example.API_Demo2.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    ReservaRepository reservaRepository;

    public List<Reserva> buscarPorIdAluno(Long id){
        return reservaRepository.findByIdAluno(id);
    }
}