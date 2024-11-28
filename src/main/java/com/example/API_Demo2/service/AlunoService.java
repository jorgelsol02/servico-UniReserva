package com.example.API_Demo2.service;

import com.example.API_Demo2.model.Aluno;
import com.example.API_Demo2.model.Sala;
import com.example.API_Demo2.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno buscarAlunoPorId(Long id){
        return alunoRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não localizada"));
    }
}
