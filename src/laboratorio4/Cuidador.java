/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;
import proyectointegrador1.Persona;
/**
 *
 * @author educacionit
 */
public class Cuidador extends Persona {
    
    private int CantidadDeRaciones;   
    
    public Cuidador(int CantidadDeRaciones, String normbre, String apellido, String numeroDocumento) {
        super(normbre, apellido, numeroDocumento);
        this.CantidadDeRaciones = CantidadDeRaciones;
    }
    public void alimentarAnimales(){
        if (CantidadDeRaciones>=(Zoologico.CANTIDAD_ANIMALES*Zoologico.RACIONES_POR_ANIMAL)){
            System.out.println("Se pudo alimentar a todos los animales");
        }else 
            System.out.println("No se pudo alimentar a todos los animales");
    }

    
}
