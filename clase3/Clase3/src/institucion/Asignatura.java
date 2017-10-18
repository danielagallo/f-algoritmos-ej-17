/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion;

/**
 *
 * @author Daniela
 */
public class Asignatura {

    //Declaración de Variables
    private String nombre;
    private int creditos;

    //Se crean los métodos establecer y obtener
    public void establecer_nombre(String n) {
        nombre = n;
    }

    public void establecrer_creditos(int n) {
        creditos = n;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public int obtener_creditos() {
        return creditos;
    }
    
    //Para presentar los resultados de los créditos de las asignaturas
    @Override
    public String toString() {
        String cadena = String.format("%s con número de créditos %d", obtener_nombre(), obtener_creditos());

        return cadena;
    }

}
