package com.RAN.x00303318;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(MainMenu()));
            switch (opcion){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6: JOptionPane.showMessageDialog(null,"Saliendo del programa... ");
                break;
            default: JOptionPane.showMessageDialog(null,"Esa opción es invalida...");
            opcion = Integer.parseInt(JOptionPane.showInputDialog(MainMenu()));
            }
        } while (opcion != 6);
    }
    //metodo menu
    public static String MainMenu() {
        return "MENU\n" + "1. Agregar empleado\n\t" + "2. Despedir empleado\n\t" + "3. Ver lista de empleados \n" +
                "4. Calcular sueldo\n\t" + "5. Mostrar totales\n\t" + "6. Salir del programa\n\t";
    }
}

