package com.example.API_Demo2.controller;

import com.example.API_Demo2.model.Reserva;
import com.example.API_Demo2.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
