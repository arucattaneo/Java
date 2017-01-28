/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointegrador1;

/**
 *
 * @author educacionit
 */
public class Programa {

    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo(20, 10, 50);
        System.out.println("ancho: " + v1.getAncho() + ", alto: " + v1.getAlto() + ", largo: " + v1.getLargo());
        Persona p1 = new Persona("Juan", "Sanchez", "39770683");
        System.out.println("Nombre: " + p1.getNormbre() + ", Apellido: " + p1.getApellido() + ", DNI: " + p1.getNumeroDocumento());

        System.out.println("Clase terminada :D");
    }

}
