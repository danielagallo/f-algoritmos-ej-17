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
public class Principal1 {

    public static void main(String[] args) {
        
        Carrera c = new Carrera("Contabilidad","presencial");
        Carrera c2 = new Carrera("Economia","distancia");
        
        Asignatura a = new Asignatura(c);
        Asignatura a2 = new Asignatura(c2);
        
        System.out.println(a);
        System.out.println(a2);
    }
}
