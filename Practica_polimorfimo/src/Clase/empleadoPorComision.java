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
public class empleadoPorComision extends empleado{
   protected double ventaBruta;
   protected double tarifa_comision;
    DecimalFormat d=new DecimalFormat("0.00");
     
    public empleadoPorComision(String nombre, String apellido_p, String num_seguro_social,double venta,double tarifa) {
        super(nombre, apellido_p, num_seguro_social);
        this.ventaBruta=venta;
        this.tarifa_comision=tarifa;
    }

    public double getVentaBruta() {
        return ventaBruta;
    }

    public double getTarifa_comision() {
        return tarifa_comision;
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
    public String ingresos() {
     return "ingresos: $"+d.format((ventaBruta*tarifa_comision));    
    
    }
    
}
