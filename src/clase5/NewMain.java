/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

import clase3.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author educacionit
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
         List <String> nombres = new ArrayList();
         nombres.add("Juan");
         nombres.add("Pablo");
         nombres.add("Pedro");
         //no muy utilizada
         for (int i=0;i<nombres.size();i++){
             System.out.println(nombres.get(i));
         }    
        //más utilizada -> For each
        for (String nombre:nombres){
            System.out.println(nombre);
        }
        //falta hacer new persona
        Persona p3=new Persona();
        Map<String,Persona>personas = new HashMap();
        personas.put(p.getDni(),p);
        personas.put(p2.getDni(), p2);
        personas.put("11",p3);
        personas.get("11").setNombre("Diego");
        //imprime solo values
        for (Persona p: personas.values()){
            System.out.println(p);
        }
        //imprime valores y keys
        for(String dni: personas.keySet()){
            System.out.println(dni + "->" + personas.get(dni));
        }
        //Entry Set
        for (Map.Entry<String, Persona> entry:personas.entrySet())
            System.out.println(entry.getKey()+entry.getValue());
         
    }
    
}
