/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

/**
 *
 * @author educacionit
 */
public class Programa1 {
    public static void main (String[] args) {
        Empleado e1= new Empleado ("Juan","Perez", "10","300");
        Administrativo a1= new Administrativo("Julia","Lopez","11","301",10000);
        Profesor p1 = new Profesor ("Juana","Manso","12","302","Java",300);
        
        a1.trabajar();
        p1.trabajar();
        a1.cobrarSueldo();
        p1.cobrarSueldo();
    }
}
