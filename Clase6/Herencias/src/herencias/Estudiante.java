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
public class Estudiante extends Persona {

     private Asignatura_Presencial [] asig_pres = new Asignatura_Presencial[2];

    
    public Estudiante(String n, String a, int e, Asignatura_Presencial asi1, Asignatura_Presencial asi2){
        super(n, a, e);
        asig_pres[0]=asi1;
        asig_pres[1]=asi2;
        
       
    }
    
    public void setAsig_pres(Asignatura_Presencial[] asig_pres) {
        this.asig_pres = asig_pres;
    }

    public Asignatura_Presencial[] getAsig_pres() {
        return asig_pres;
    }
    
    
    public Asignatura_Presencial obtener_asig1(){
        return asig_pres[0];
    }
    public Asignatura_Presencial obtener_asig2(){
        return asig_pres[1];
    }
    
    public double Obtener_valor_matricula(){
        double a=0;
        for (int i = 0; i < asig_pres.length; i++) {
            a=a+asig_pres[i].getCosto();
            
        }
        return a;
    }
    
   
    @Override
    public String toString(){
    
        return String.format("Nombre: %s\nApellido %s\nCosto Matricula: %.2f\nEdad: %d"
                + "\nListado de Asignaturas\n%s\n%s",nombre,apellido,Obtener_valor_matricula(),edad,obtener_asig1(),obtener_asig2());
    }
    
    
    
}
