package com.company.intecap.apirestlib.model;

public class Automovil {
    private int idAutomovil;
    private String marca;
    private int modelo;
    private String color;
    private String placa;
    private double precio;

    public Automovil(int idAutomovil, String marca, int modelo, String color, String placa, double precio){
        this.idAutomovil = idAutomovil;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
        this.precio = precio;
    }

    public int getIdAutomovil() {
        return idAutomovil;
    }

    public void setIdAutomovil(int idAutomovil) {
        this.idAutomovil = idAutomovil;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
