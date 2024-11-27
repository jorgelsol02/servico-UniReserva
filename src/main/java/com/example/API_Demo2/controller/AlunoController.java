package com.example.API_Demo2.controller;

import com.example.API_Demo2.model.Aluno;
import com.example.API_Demo2.model.Sala;
import com.example.API_Demo2.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public List<Aluno> listar(){
        return alunoRepository.findAll();
    }
}
