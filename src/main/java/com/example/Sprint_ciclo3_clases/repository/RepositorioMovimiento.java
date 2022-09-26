package com.example.Sprint_ciclo3_clases.repository;

import com.example.Sprint_ciclo3_clases.entities.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioMovimiento extends JpaRepository<MovimientoDinero, Long> {
}
