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
public abstract class empleado {
    protected String nombre;
    protected String apellido_p;
    protected String num_seguro_social;

    public empleado(String nombre, String apellido_p, String num_seguro_social) {
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.num_seguro_social = num_seguro_social;
    }

    
    public abstract String ingresos(); 
    
}
