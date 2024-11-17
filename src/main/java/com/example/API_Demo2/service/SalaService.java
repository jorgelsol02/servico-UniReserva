package com.example.API_Demo2.service;

import com.example.API_Demo2.model.Sala;
import com.example.API_Demo2.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaService {

    @Autowired
    private SalaRepository salaRepository;

    public Sala buscarSalaPorId(Long id){
        return salaRepository.findById(id).orElseThrow(() -> new RuntimeException("Sala não localizada"));
    }

    public void deletarSalaPorId(Long id) {
        if (salaRepository.existsById(id)) {
            salaRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Sala com ID " + id + " não encontrada.");
        }
    }

}
