package com.example.API_Demo2.controller;

import com.example.API_Demo2.model.Sala;
import com.example.API_Demo2.repository.SalaRepository;

import com.example.API_Demo2.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/sala")
public class SalaController {

    @Autowired
    private SalaRepository salaRepository;

    @Autowired
    private SalaService salaService;

    @GetMapping
    public List<Sala> listar(){
        return salaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Sala buscarSalaPorId(@PathVariable Long id){
        return salaService.buscarSalaPorId(id);
    }

    @DeleteMapping("/{id}")
    public String deletarSala(@PathVariable Long id) {
        try {
            salaService.deletarSalaPorId(id);
            return "Sala com ID " + id + " foi deletado com sucesso.";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Sala adicionar(@RequestBody Sala sala){
        return salaRepository.save(sala);
    }

}
