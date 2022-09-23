package com.example.Sprint_ciclo3_clases.entities;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "imagen")
    private String imagen;

    @Column(name = "auth0Id", unique = true)
    private String auth0Id;

    //constructor vacio de la tabla
    public Usuarios(){

    }
    // Constructor de la clase
    public Usuarios(String email, String imagen, String auth0Id) {
        this.email = email;
        this.imagen = imagen;
        this.auth0Id = auth0Id;    }

    //Getter ys setters

    public Long getId() {
        return Id;    }
    public void setId(Long id) {
        Id = id;    }

    public String getEmail() {
        return email;    }
    public void setEmail(String email) {
        this.email = email;    }

    public String getImagen() {
        return imagen;    }
    public void setImagen(String imagen) {
        this.imagen = imagen;    }

    public String getAuth0Id() {
        return auth0Id;    }
    public void setAuth0Id(String auth0Id) {
        this.auth0Id = auth0Id;    }
}
