package com.RAN.x00303318;

public class Documento {
    //Atributos
    private String nombre;
    private String numero;
    //Contructor
    public Documento(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public String getNumero() {
        return numero;
    }
}