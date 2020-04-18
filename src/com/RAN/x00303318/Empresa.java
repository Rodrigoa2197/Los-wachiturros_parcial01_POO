package com.RAN.x00303318;

import java.util.ArrayList;
import java.util.List;

public class Empresa extends Empleado {
    //Atributos
    private String nombre;
    private List<Empleado> planilla;
    //Constructor


    public Empresa(String nombre, String numero, String nombre1, String puesto, double salario, String nombre2) {
        super(nombre, numero, nombre1, puesto, salario);
        this.nombre = nombre2;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public List<Empleado> getPlanilla() {
        return planilla;
    }
    /* public void addEmpleado(List<Empleado>empleados){
        empleados.add(Empleado);
    }*/ /*COMPLETAR CLASE EMPLEADOS PARA SEGUIR*/
}
/*public class Empresa{
    private String nombre;
    private List<Empleado> planilla = new ArrayList<Empleado>();

    //Constructor
    public Empresa(String nombre){
        this.nombre = nombre;
    }

    //Setters & Getters
    public String getNombre(){
        return nombre;
    }
    public List<Empleado> getPlanilla(){
        return planilla;
    }

    //Metodos
    public void addEmpleado(Empleado empleado){

    }
    public void quitEmpleado(String nombre){

    }
}*/