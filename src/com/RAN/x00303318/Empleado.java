package com.RAN.x00303318;

import java.awt.*;
import java.util.List;

public abstract class Empleado extends Documento{
    //Atributos
    protected String nombre;
    protected String puesto;
    protected List<Documento> documentos;
    protected double salario;
    //Constructor

    public Empleado(String nombre, String numero, String nombre1, String puesto, double salario) {
        super(nombre, numero);
        this.nombre = nombre1;
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

}
/*abstract class Empleado {
    protected String nombre = "\0";
    protected String puesto = "\0";
    protected List<Documento> documentos = new ArrayList<Documento>();
    protected double salario = 0.00f;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void addDocumento(Documento a){
    }

    public void removeDocumento(String a){
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}*/