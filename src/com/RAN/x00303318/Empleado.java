package com.RAN.x00303318;

import java.awt.*;
import java.util.List;

public abstract class Empleado{
    //Atributos
    protected String nombre;
    protected String puesto;
    protected List<Documento> documentos;
    protected double salario;
    //Constructor
    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    //Getters y setters
    public String getNombre() {
        return nombre;
    }
    public String getPuesto() {
        return puesto;
    }
    public List<Documento> getDocumentos() {
        return documentos;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    //metodos
    //adicionar
    public void addDocumento(Documento a){
        documentos.add(a);
    }
    //remover
    public void removeDocumento(String a){
        documentos.removeIf(s -> (s.getNombre().equals(a)));
    }

}
