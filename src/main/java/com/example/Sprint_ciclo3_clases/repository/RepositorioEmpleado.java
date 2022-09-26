package com.example.Sprint_ciclo3_clases.repository;

import com.example.Sprint_ciclo3_clases.entities.Empleado;
import com.example.Sprint_ciclo3_clases.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositorioEmpleado extends JpaRepository <Empleado, Long >{

}
