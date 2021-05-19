/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Clase.Empleado_por_horas;
import Clase.empleadoBase_comision;
import Clase.empleadoPorComision;
import Clase.empleado_Asalariado;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class principal {

    public String[] datos() {
        Scanner l = new Scanner(System.in);
        String v[] = new String[3];
        System.out.println("Ingrese su nombre");
        v[0] = l.next();
        System.out.println("Ingrese su Apellido Paterno");
        v[1] = l.next();
        System.out.println("Ingrese su Numero de Seguro Social");
        v[2] = l.next();
        return v;

    }

    public static void main(String[] org) {
        Scanner l = new Scanner(System.in);
       
        int eleccion = 0;
        String ss="";
        ArrayList<String>m=new ArrayList<String>();
        principal p = new principal();
            
        while (eleccion != 5) {
            if(ss.equals("n")||ss.equals("N")){
                break;
            }else{
            System.out.println("1-ingreso empleado Asalariado");
            System.out.println("2-ingreso empleado por horas");
            System.out.println("3-ingreso empleado por Comision");
            System.out.println("4-ingreso empleado base mas comision");
            System.out.println("5-Salir");
            eleccion = l.nextInt();
            String v[] = new String[3];
            
            if(eleccion!=5){
            
            switch (eleccion) {
                case 1:
                    v = p.datos();
                    System.out.println("Ingrese su salario");
                    double salario = l.nextDouble();
                    empleado_Asalariado e1 = new empleado_Asalariado(v[0], v[1], v[2], salario);
                    m.add("empleado asalariado: "+e1.getNombre()+" "+e1.getApellido_p());
                    m.add("numero de seguro social: "+e1.getNum_seguro_social());
                    m.add("Salario semanal: "+e1.getSalario());
                    m.add(e1.ingresos());
                    m.add("");break;

                case 2:
                    v = p.datos();
                    System.out.println("Ingrese su Sueldo por horas");
                    double sueldo = l.nextDouble();

                    System.out.println("Ingrese sus horas Trabajado");
                    double horas = l.nextDouble();
                    Empleado_por_horas e2 = new Empleado_por_horas(v[0], v[1], v[2], sueldo, horas);
                    m.add("empleado por horas: "+e2.getNombre()+" "+e2.getApellido_p());
                    m.add("numero de seguro social: "+e2.getNum_seguro_social());
                    m.add("sueldo por hora: $"+e2.getSueldo_por_horas()+"; horas trabajadas: $"+e2.getHoras_trabajada());
                    m.add(e2.ingresos());
                    m.add("");
                    break;

                case 3:
                    v = p.datos();
                    System.out.println("Ingrese su Venta Bruta");
                    double venta = l.nextDouble();

                    System.out.println("Ingrese su Tarifa comision");
                    double tarifa = l.nextDouble();
                    empleadoPorComision e3 = new empleadoPorComision(v[0], v[1], v[2], venta, tarifa);
                    m.add("empleado por comision: "+e3.getNombre()+" "+e3.getApellido_p());
                    m.add("numero de seguro social: "+e3.getNum_seguro_social());
                    m.add("ventas brutas: $"+e3.getVentaBruta()+"; tarifa de comision: $"+e3.getTarifa_comision());
                    m.add(e3.ingresos());
                    m.add("");
                    
                    
                    break;
                case 4:
                    v = p.datos();
                    System.out.println("Ingrese su Venta Bruta");
                    double vent = l.nextDouble();

                    System.out.println("Ingrese su Tarifa comision");
                    double tarif = l.nextDouble();
                    System.out.println("Ingrese su Salario Base");
                    double sala = l.nextDouble();
                    empleadoBase_comision e4 = new empleadoBase_comision(v[0], v[1], v[2], vent, tarif, sala);
                    m.add("con salario base empleado por comision: "+e4.getNombre()+" "+e4.getApellido_p());
                    m.add("numero de seguro social: "+e4.getNum_seguro_social());
                    m.add("ventas brutas: $"+e4.getVentaBruta()+"; tarifa de comision: $"+e4.getTarifa_comision()+"; "+e4.ingresos());
                    m.add("");
                    
                    break;
            }
            //Traendo datos ingresados
            
                System.out.println("Quiere seguir ingresando datos ponga S o N");
                 ss=l.next();
            }
            }
            
        }
        p.imprimir(m);
                    

    }
    public void imprimir(ArrayList m2){
        
        for(int i=0;i<m2.size();i++){
            System.out.println(m2.get(i));
        }
        
    }
}
