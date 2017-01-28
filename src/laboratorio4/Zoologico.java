/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

/**
 *
 * @author educacionit
 */
public class Zoologico implements IZoologico {
    
    public static final int CANTIDAD_ANIMALES = 25; 
    public static final int RACIONES_POR_ANIMAL = 5;
    private boolean abierto;
    
    @Override
    public void abrir(){
        abierto=true;
        System.out.println("Zoológico abierto");
    };
    @Override
    public void alimentarAnimales (int CantidadDeRaciones){
        Cuidador c1= new Cuidador(CantidadDeRaciones, "", "", "");
        c1.alimentarAnimales();
    }
    @Override
    public void cerrar(){
        abierto=false;
        System.out.println("Zoológico cerrado");
    }
}
