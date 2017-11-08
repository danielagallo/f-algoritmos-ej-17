/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;
import herencia_ejm.*;
/**
 *
 * @author reroes
 */
public class Herencias {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Asignatura_Presencial asi1 = new Asignatura_Presencial("Programacion", "Comun", 100, 180);
        Asignatura_Presencial asi2 = new Asignatura_Presencial("Literatura", "Troncal", 300, 200);
        
        Estudiante e = new Estudiante("René", "Elizalde", 34 , asi1,asi2);
        System.out.println(e);
        
       
        
    }
    
}
