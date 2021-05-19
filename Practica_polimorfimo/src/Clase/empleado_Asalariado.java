/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

/**
 *
 * @author eliana
 */
public class empleado_Asalariado extends empleado{
    private double salario;

    public empleado_Asalariado(String nombre, String apellido_p, String num_seguro_social,double salario) {
        super(nombre, apellido_p, num_seguro_social);
        this.salario=salario;
    }

    public double getSalario() {
        return salario;
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
        return "ingresos: "+salario;
    }

    
    
}
