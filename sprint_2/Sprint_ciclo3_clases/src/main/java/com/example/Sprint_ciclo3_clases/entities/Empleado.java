
package com.example.Sprint_ciclo3_clases.entities;

public class Empleado {

    private String nombreEmpleado;
    private String correo;
    private String cargo;
    private String empresa;

    public Empleado(String nombreEmpleado, String correo, String cargo, String empresa) {

        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        this.cargo = cargo;
        this.empresa = empresa;
    }

    // ====getter and setter====

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

}