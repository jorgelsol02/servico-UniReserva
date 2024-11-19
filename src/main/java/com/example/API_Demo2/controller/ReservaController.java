package com.example.API_Demo2.controller;

import com.example.API_Demo2.model.Reserva;
import com.example.API_Demo2.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reserva")
public class ReservaController {

    @Autowired
    private ReservaRepository reservaRepository;

    @GetMapping()
    public List<Reserva> findAll(){
        return reservaRepository.findAll(); //alterar para findById
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Reserva adicionar(@RequestBody Reserva reserva){
        return reservaRepository.save(reserva);
    }

    @GetMapping("/{id}")
    public List<Reserva> findByIdAluno(@PathVariable Long id){
        return reservaRepository.findByIdAluno(id);
    }
}
