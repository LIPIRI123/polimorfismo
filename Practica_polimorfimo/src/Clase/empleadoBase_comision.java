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
public class empleadoBase_comision extends empleadoPorComision {
    private double salario_base; 

    public empleadoBase_comision(String nombre, String apellido_p, String num_seguro_social, double venta, double tarifa,double salario) {
        super(nombre, apellido_p, num_seguro_social, venta, tarifa);
       this.salario_base=salario;
    }

    public double getSalario_base() {
        return salario_base;
    }
    
    @Override
    public double getVentaBruta() {
        return ventaBruta;
    }

    @Override
    public double getTarifa_comision() {
        return tarifa_comision;
    }
   
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getApellido_p() {
        return apellido_p;
    }

    public String getNum_seguro_social() {
        return num_seguro_social;
    }
    
    @Override
    public String ingresos(){
         DecimalFormat d=new DecimalFormat("0.00");
         return "salario base: $"+d.format(((tarifa_comision*ventaBruta)+salario_base));
    }
}
