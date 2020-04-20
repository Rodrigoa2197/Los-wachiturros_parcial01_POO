package com.RAN.x00303318;

public class ServicioProfesional extends Empleado {
    //Atributos
    private int mesesContrato = 0;
    //Constructor
    public ServicioProfesional(String nombre, String puesto, double salario, int mesesContrato) {
        super(nombre, puesto, salario);
        this.mesesContrato = mesesContrato;
    }
    //Getters y setters
    public int getMeses() {
        return mesesContrato;
    }
    public void setMeses(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }
}