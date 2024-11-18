package com.example.API_Demo2.repository;

import com.example.API_Demo2.model.Sala;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Long> {

    List<Sala> findByNumero (Long numero);

    List<Sala> findByCadeira (Long cadeira);

}
