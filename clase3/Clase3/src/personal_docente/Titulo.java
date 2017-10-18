/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal_docente;

/**
 *
 * @author Daniela
 */
public class Titulo {

    //Declaración de Variables
    private String nombre;
    private String nombre_universidad;

    //Se crean los métodos establecer y obtener
    public void establecer_nombre(String n) {
        nombre = n;
    }

    public void establecer_nombre_universidad(String n) {
        nombre_universidad = n;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public String obtener_nombre_universidad() {
        return nombre_universidad;
    }
    
    //Para presentar los resultados del nombre del título y del nombre de la universidad
    @Override
    public String toString() {
        String cadena = String.format("%s - %s", obtener_nombre(),
                obtener_nombre_universidad());
        return cadena;
    }

}
