package com.RAN.x00303318;

public class PlazaFija extends Empleado{
    //Atributos
    private int extensión =0;
    //Constructor
    public PlazaFija(String nombre, String puesto, double salario, int extensión) {
        super(nombre, puesto, salario);
        this.extensión = extensión;
    }
    //getters y setters
    public int getExtensión() {
        return extensión;
    }
    public void setExtensión(int extensión) {
        this.extensión = extensión;
    }
}