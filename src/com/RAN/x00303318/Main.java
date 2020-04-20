package com.RAN.x00303318;

import javax.swing.*;


public class Main {

    public static void main(String[] args) {

        boolean confirm=false;
        int opcion;
        String nombre = null, puesto, nombreEmpresa = null, nombre_despedir = null;
        double salario;
        Empresa empresa =  new Empresa(nombreEmpresa);

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

                    nombre_despedir = JOptionPane.showInputDialog(null, "Digite el nombre del empleado a despedir");
                    empresa.quitEmpleado(nombre);
                    break;

                case 3:
                    int cantidad_empleado= 0;
                    boolean existe = false;
                    JOptionPane.showMessageDialog(null,"Lista de empleados de la empresa " + empresa.getNombre());
                    for(Empleado aux:empresa.getPlanilla()){
                        existe=true;
                        cantidad_empleado++;
                        String cadena = null;
                        for(Documento a:aux.getDocumentos()){
                            cadena+=a.getNombre()+": "+a.getNumero()+"\n";
                        }
                        if(aux instanceof PlazaFija){
                            JOptionPane.showMessageDialog(null,"ID: "+cantidad_empleado+"\n"+"Nombre: "+aux.getNombre()+"\n"+"Puesto: "+aux.getPuesto()+"\n"+cadena+"Salario: USD"+aux.getSalario()+"\n"+"Extensión: "+((PlazaFija) aux).getExtensión());
                        }
                        else if(aux instanceof ServicioProfesional){
                            JOptionPane.showMessageDialog(null,"ID: "+cantidad_empleado+"\n"+"Nombre: "+aux.getNombre()+"\n"+"Puesto: "+aux.getPuesto()+"\n"+cadena+"Salario: USD"+aux.getSalario()+"\n"+"Meses: "+((ServicioProfesional) aux).getMeses());
                        }
                    }
                    if(existe == false){
                        JOptionPane.showMessageDialog(null,"ID no encontrado....");
                    }
                    break;

                case 4:
                    int id=0;
                    char despliegue;
                    String cadena = null;
                    boolean total = false;

                    nombre = JOptionPane.showInputDialog(null, "Digite el nombre del empleado");
                    for(Empleado chale1:empresa.getPlanilla()){
                        if(chale1.getNombre().equalsIgnoreCase(nombre) && total == false){
                            for(Documento a:chale1.getDocumentos()){
                                cadena+=a.getNombre()+": "+a.getNumero()+"\n";
                            }
                            if (chale1 instanceof PlazaFija) {
                                despliegue = JOptionPane.showInputDialog(null, "Empleado a despedir" + "\n" + "Nombre: " + chale1.getNombre() + "\n" + "Puesto: " + chale1.getPuesto() + "\n" + cadena + "Salario: USD" + chale1.getSalario() + "\n" + "Extensión: " + ((PlazaFija) chale1).getExtensión()).charAt(0);
                                if (despliegue == 'Y') {
                                    total= true;
                                } else if (despliegue == 'y') {
                                    total = true;
                                }else{}
                            } else if (chale1 instanceof ServicioProfesional) {
                                despliegue = JOptionPane.showInputDialog(null, "Empleado a despedir\"" + "\n" + "Nombre: " + chale1.getNombre() + "\n" + "Puesto: " + chale1.getPuesto() + "\n" + cadena + "Salario: USD" + chale1.getSalario() + "\n" + "Meses: " + ((ServicioProfesional) chale1).getMeses()).charAt(0);
                                if (despliegue == 'Y') {
                                    total = true;
                                } else if (despliegue == 'y') {
                                    total = true;
                                }else{}
                            }
                        }
                        if(total==false){
                            id++;
                        }
                        else{
                        }
                    }
                    if (total == true){
                        JOptionPane.showMessageDialog(null,"Sueldo del empleado:"+ CalculadoraImpuestos.calcularPago(empresa.getPlanilla().get(id)));
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Empleado no existente");
                    }


                case 5:
                    JOptionPane.showMessageDialog(null, CalculadoraImpuestos.mostrarTotales());
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