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
public class Persona {
    String normbre;
    String apellido;
    String numeroDocumento;

    public void setNormbre(String normbre) {
        this.normbre = normbre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNormbre() {
        return normbre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public Persona(String normbre, String apellido, String numeroDocumento) {
        this.normbre = normbre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
    }
}
