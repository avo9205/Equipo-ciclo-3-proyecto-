package com.example.Sprint_ciclo3_clases.services;

import com.example.Sprint_ciclo3_clases.entities.Usuarios;
import com.example.Sprint_ciclo3_clases.repository.RepositorioUsuarios;
import org.springframework.stereotype.Service;

import java.util.Map;

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

    //metodos funcional
    //función de busqueda del usuario por medio del correo
    public Usuarios buscarPorEmail(String email){
         return this.repositorioUser.findByEmail(email);
    }
    //función que guarda al usuario
    public  Usuarios crearUsuario(Usuarios nuevoUsuario){
         return  this.repositorioUser.save(nuevoUsuario);
    }

    public Usuarios getCreateUsuario(Map<String,Object> DatosUsuario){
        String email = (String) DatosUsuario.get("email");
        Usuarios usuario = buscarPorEmail(email);
        //se valida si el usuario existe o no
        if(usuario == null){
            String alias = (String) DatosUsuario.get("nickname");
            String imagen = (String) DatosUsuario.get("picture");
            String auth0Id =(String) DatosUsuario.get("sub");

            Usuarios nuevoUsuario = new Usuarios(email = email, imagen = imagen, auth0Id = auth0Id);
            return crearUsuario(nuevoUsuario);
        }
        System.out.println(usuario.getEmail());
         return usuario;
    }


}
