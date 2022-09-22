
package com.example.prueba.repositorio;

import com.example.prueba.entidades.MovimientoDinero;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoDineroRepository extends JpaRepository<MovimientoDinero, Long> {
    
}
