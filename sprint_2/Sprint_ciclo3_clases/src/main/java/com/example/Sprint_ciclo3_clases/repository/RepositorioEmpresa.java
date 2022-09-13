package com.example.Sprint_ciclo3_clases.repository;

import com.example.Sprint_ciclo3_clases.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioEmpresa extends JpaRepository <Empresa, Long > {


}
