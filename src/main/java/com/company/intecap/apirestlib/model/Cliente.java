package com.company.intecap.apirestlib.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
    private String nombre;
    private String apellido;
    private String direccion;

    public Cliente() {

    }

    public Integer getId() {
        return id;
    }
public Cliente(int id, String nombre, String apellido, String direccion){
        this.id  = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;


}
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
