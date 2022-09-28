package com.example.Sprint_ciclo3_clases.repository;

import com.example.Sprint_ciclo3_clases.entities.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuarios extends JpaRepository <Usuarios,Long> {
    Usuarios findByEmail(String email);
}
