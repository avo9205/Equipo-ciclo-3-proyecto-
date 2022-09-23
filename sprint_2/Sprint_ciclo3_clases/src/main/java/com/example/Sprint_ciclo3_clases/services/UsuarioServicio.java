package com.example.Sprint_ciclo3_clases.services;

import com.example.Sprint_ciclo3_clases.repository.RepositorioUsuarios;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {
    private RepositorioUsuarios repositorioUser;

    //Constructor del servicio usuario

     public UsuarioServicio(RepositorioUsuarios repositorioUser){
         this.repositorioUser = repositorioUser; }

    //Get y set del atributo

    public RepositorioUsuarios getRepositorioUser() {
        return repositorioUser;    }
    public void setRepositorioUser(RepositorioUsuarios repositorioUser) {
        this.repositorioUser = repositorioUser;    }
}
