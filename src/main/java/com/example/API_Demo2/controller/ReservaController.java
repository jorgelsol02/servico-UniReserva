package com.example.API_Demo2.controller;

import com.example.API_Demo2.model.Reserva;
import com.example.API_Demo2.repository.ReservaRepository;
import com.example.API_Demo2.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reserva")
public class ReservaController {

    @Autowired
    private ReservaRepository reservaRepository;
    private ReservaService reservaService;

    @GetMapping()
    public List<Reserva> findAll(){
        return reservaRepository.findAll(); //alterar para findById
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Reserva adicionar(@RequestBody Reserva reserva){
        return reservaRepository.save(reserva);
    }

    @GetMapping("/aluno/{id}")
    public List<Reserva> findByIdAluno(@PathVariable Long id){
        return reservaRepository.findByIdAluno(id);
    }

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @DeleteMapping("/remover/{id}")
    public ResponseEntity<Void> deletarReserva(@PathVariable Long id) {
        reservaService.deletarReservaPorId(id);
        return ResponseEntity.noContent().build(); // Retorna HTTP 204 (No Content)
    }
}
