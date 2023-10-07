package com.company.intecap.apirestlib.model;

public class Productos {

    private int idProducto;
    private String nombre;
     private String descripcio;

     public Productos(int idProducto, String nombre, String descripcio){
         this.idProducto = idProducto;
         this.nombre = nombre;
         this.descripcio = descripcio;

     }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }
}
