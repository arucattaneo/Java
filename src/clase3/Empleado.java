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
public class Empleado extends Persona {
    private String legajo;

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
    
    public void trabajar(){
        System.out.println("Estoy trabajando");
    };
    public void cobrarSueldo(){
        System.out.println("Quiero cobrar");
    };

    public Empleado(String nombre, String apellido, String dni, String legajo) {
        super(nombre, apellido, dni);
        this.legajo = legajo;
    }
 

    
}
