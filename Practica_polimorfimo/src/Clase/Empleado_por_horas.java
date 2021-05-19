/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import java.text.DecimalFormat;

/**
 *
 * @author eliana
 */
public class Empleado_por_horas extends empleado{
    double sueldo_por_horas;
    double horas_trabajada;

    public Empleado_por_horas(String nombre, String apellido_p, String num_seguro_social,double sueldo,double horas_trabajo) {
        super(nombre, apellido_p, num_seguro_social);
        this.sueldo_por_horas=sueldo;
        this.horas_trabajada=horas_trabajo;
    }

    public double getSueldo_por_horas() {
        return sueldo_por_horas;
    }

    public double getHoras_trabajada() {
        return horas_trabajada;
    }
    
        
    public String getNombre() {
        return nombre;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public String getNum_seguro_social() {
        return num_seguro_social;
    }
    
    

    @Override
    public String ingresos(){
         DecimalFormat d=new DecimalFormat("0.00");
        if(horas_trabajada<=40){
            sueldo_por_horas=sueldo_por_horas*horas_trabajada;
        }else if(horas_trabajada>40){
            sueldo_por_horas=40*sueldo_por_horas+(horas_trabajada-40)*sueldo_por_horas*1.5;
        }
        return "ingresos: $"+d.format(sueldo_por_horas);
    
    }
    
}
