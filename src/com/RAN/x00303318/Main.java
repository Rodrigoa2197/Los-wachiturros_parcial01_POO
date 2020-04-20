package com.RAN.x00303318;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        boolean confirm=false;
        int opcion;
        String nombre, puesto;
        double salario;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(MainMenu()));
            switch (opcion) {

                case 1:
                        do {
                            nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la persona");
                            if(nombre.isEmpty()){
                                JOptionPane.showMessageDialog(null, "Nombre invalido... ");
                            }
                            confirm=true;
                        }while(!confirm);

                        do{
                            puesto = JOptionPane.showInputDialog(null, "Ingrese el puesto de la persona (plaza fija o servicio profesional");
                            if(!(puesto.equalsIgnoreCase("plaza Fija")||puesto.equalsIgnoreCase("servicio Profesional"))||puesto.isEmpty()){
                                JOptionPane.showMessageDialog(null, "Puesto invalido... ");
                            }
                            confirm=true;
                        }while(!confirm);

                        do{
                            salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario"));
                            if(salario<=0){
                                JOptionPane.showMessageDialog(null, "Salario invalido... ");
                            }
                            confirm=true;
                        }while(!confirm);

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa... ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Esa opción es invalida...");
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(MainMenu()));
            }
        } while (opcion != 6);
    }

    //metodo menu
    public static String MainMenu() {
        return "MENU\n" + "1. Agregar empleado\n\t" + "2. Despedir empleado\n\t" + "3. Ver lista de empleados \n" +
                "4. Calcular sueldo\n\t" + "5. Mostrar totales\n\t" + "6. Salir del programa\n\t";
    }

    private static String DocuMenu() {
        return "MENU\n\t" + "1. Agregar Documento\n\t" + "2. Eliminar Documento\n\t" + "3. Salir\n\t";
    }
}

