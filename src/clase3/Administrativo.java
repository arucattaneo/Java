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
public class Administrativo extends Empleado {
    private int sueldo;
   
    public int getSueldo() {
        return sueldo;
    }
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public Administrativo(String nombre, String apellido, String dni, String legajo, int sueldo) {
        super(nombre, apellido, dni, legajo);
        this.sueldo = sueldo;
    }
    
    
    
}
