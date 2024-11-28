package com.example.API_Demo2.controller;

import com.example.API_Demo2.model.Aluno;
import com.example.API_Demo2.repository.AlunoRepository;
import com.example.API_Demo2.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<Aluno> listar(){
        return alunoRepository.findAll();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Aluno adicionar(@RequestBody Aluno aluno){
        return alunoRepository.save(aluno);
    }

    @GetMapping("/{id}")
    public Aluno buscarAlunoPorId(@PathVariable Long id){
        return alunoService.buscarAlunoPorId(id);
    }
}
