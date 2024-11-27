package com.example.API_Demo2.service;

import com.example.API_Demo2.model.Reserva;
import com.example.API_Demo2.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    ReservaRepository reservaRepository;

    public List<Reserva> buscarPorIdAluno(Long id){
        return reservaRepository.findByIdAluno(id);
    }

    public ReservaService(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public void deletarReservaPorId(Long id) {
        if (!reservaRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Reserva com ID " + id + " não encontrada.");
        }
        reservaRepository.deleteById(id);
    }
}
