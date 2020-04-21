package com.RAN.x00303318;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Empleado> planilla = new ArrayList<Empleado>();

    //Constructor
    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getPlanilla() {
        return planilla;
    }

    //Metodos
    public void addEmpleado(Empleado empleado) {
        planilla.add(empleado);
    }

    public void quitEmpleado(String nombre) {
        boolean quit = false;
        int cont = 0;
        char confirma;
        for (Empleado chale : planilla) {
            if (chale.getNombre().equalsIgnoreCase(nombre)) {
                String datos = null;
                for (Documento a : chale.getDocumentos()) {
                    datos += a.getNombre() + ": " + a.getNumero() + "\n";
                }
                if (chale instanceof PlazaFija) {
                    confirma = JOptionPane.showInputDialog(null, "Empleado a despedir" + "\n" + "Nombre: " + chale.getNombre() + "\n" + "Puesto: " + chale.getPuesto() + "\n" + datos + "Salario: $" + chale.getSalario() + "\n" + "Extensión: " + ((PlazaFija) chale).getExtensión()).charAt(0);

                    if (confirma == 'Y') {
                        quit = true;
                    } else if (confirma == 'y') {
                        quit = true;
                    }else{}

                        if (confirma == 'Y') {
                            quit = true;
                        } else if (confirma == 'y') {
                            quit = true;
                        }else{}

                } else if (chale instanceof ServicioProfesional) {
                    confirma = JOptionPane.showInputDialog(null, "Empleado a despedir\"" + "\n" + "Nombre: " + chale.getNombre() + "\n" + "Puesto: $" + chale.getPuesto() + "\n" + datos + "Salario: " + chale.getSalario() + "\n" + "Meses: " + ((ServicioProfesional) chale).getMeses()).charAt(0);
                    if (confirma == 'Y') {
                        quit = true;
                    } else if (confirma == 'y') {
                        quit = true;
                    }else{}
                }
            }
            cont++;
        }
        if(quit == true){
            planilla.remove(cont);
            JOptionPane.showMessageDialog(null,"¡Se guardaron los cambios exitosamente!");
        }
    }

}

}

