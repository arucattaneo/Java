/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author educacionit
 */
public class Empresa {

    public static void informarDatosDeEmpleados(List<Empleado> losEmpleados) {
        for (Empleado empleados : losEmpleados) {
            System.out.println("Apellido: " + empleados.getApellido() + "DNI: " + empleados.getDni() + "Edad: " + empleados.getEdad());
        }
    }

    public static List obtenerDatosDeEmpleadosMenosDe30(List<Empleado> losEmpleados) {
        
        List<Empleado> empleadosMenores30 = new ArrayList();
        
        for (Empleado empleado : losEmpleados) {
            if (empleado.getEdad() < 30) {
                empleadosMenores30.add(empleado);
            }
        }

        return empleadosMenores30;
    }

    public static void main(String[] args) {
        Empleado e1 = new Empleado(" 11 ", "Perez ", 41);
        Empleado e2 = new Empleado(" 12 ", "Gómez ", 29);
        Empleado e3 = new Empleado(" 13 ", "Sanchez ", 45);
        Empleado e4 = new Empleado(" 14 ", "Cattaneo ", 39);
        Empleado e5 = new Empleado(" 15 ", "Boraglio ", 40);
        Empleado e6 = new Empleado(" 16 ", "Duarte ", 44);

        List<Empleado> losEmpleados = new ArrayList();
        losEmpleados.add(e1);
        losEmpleados.add(e2);
        losEmpleados.add(e3);
        losEmpleados.add(e4);
        losEmpleados.add(e5);
        losEmpleados.add(e6);

        for (Empleado empleados : losEmpleados) {
            System.out.println("Apellido: " + empleados.getApellido() + "DNI: " + empleados.getDni() + "Edad: " + empleados.getEdad());
        }

        System.out.println("Cantidad de empleados:" + losEmpleados.size());

        System.out.println("Empleados menores de 30 años:");
        for (Empleado empleados : losEmpleados) {
            if (empleados.getEdad() < 30) {
                System.out.println("Apellido: " + empleados.getApellido() + "DNI: " + empleados.getDni() + "Edad: " + empleados.getEdad());
            }
        }
        System.out.println("Método informar datos:");
        informarDatosDeEmpleados(losEmpleados);
        
        System.out.println("Método informar datos menores de 30:");
        obtenerDatosDeEmpleadosMenosDe30(losEmpleados);
        
        System.out.println("Método usando el método anterior");
        informarDatosDeEmpleados(obtenerDatosDeEmpleadosMenosDe30(losEmpleados));
    }
}
