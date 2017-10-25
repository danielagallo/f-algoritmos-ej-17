/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

/**
 *
 * @author Daniela
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Carrera c = new Carrera("Electrónica");
        Carrera c1 = new Carrera("semipresencial","sistemas");
        
        System.out.println(c.obtener_modalidad());
        
        System.out.println(c1.obtener_modalidad());
        c1.establecer_modalidad("distancia");
        System.out.println(c1.obtener_modalidad());
        c1.establecer_modalidad(c1.obtener_modalidad().toUpperCase());
        System.out.println(c1.obtener_modalidad());
    }
}
