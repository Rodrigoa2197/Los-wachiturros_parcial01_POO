package com.RAN.x00303318;

public final class CalculadoraImpuestos {
    //Atributos y se inicia el contador
    private static double totalRenta = 0;
    private static double totalISSS = 0;
    private static double totalAFP = 0;
    //Constructor
    private CalculadoraImpuestos(){
    }
    //Metodos
    public final double calcularPago(Empleado a){
        if(a instanceof ServicioProfesional) {
            double renta;
            renta = 0.1f * a.getSalario();
            totalRenta += renta;
            return a.getSalario() - renta;
        } else{
            //Atributos y contador
            double afp;
            double isss;
            double restante;
            double renta = 0;
            //Se establece lo que se quiere dentro de cada variable
            afp = 0.0625 * a.getSalario();
            isss = 0.03 * a.getSalario();
            restante = a.getSalario() - afp - isss;
            if(restante > 0.01 && restante < 472.00){
                renta = 0;
            }
            else if(restante > 472.01 && restante < 895.24){
                renta = 0.1 * (restante - 472) +17.67;
            }
            else if(restante > 895.25 && restante < 2038.10){
                renta = 0.2 * (restante - 895.24) +60;
            }
            else if(restante > 2038.10){
                renta = 0.3 * (restante - 2038.10) +288.57;
            }else{}
            totalISSS += isss;
            totalAFP += afp;
            totalRenta += renta;
            return restante - renta;
        }
    }
    public final String mostrarTotales(){
        return "Total de ISSS: " + totalISSS + "Total de AFP: " + totalAFP + "Total de Renta: " + totalRenta;
    }
}
