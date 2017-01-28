/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

import java.util.Date;

/**
 *
 * @author educacionit
 */
public abstract class Persona {
    private String nombre;
    private Date fechaDeNacimiento;

    public String getNombre() {
        return nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
 
    
}
