/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author Daniela
 */
public class Profesor extends Persona {

    private double sueldo;
    
    public Profesor (){
        super ("Carlos", "Alvarez", 20);
        sueldo = 3000.2;
    }

    public Profesor(double s) {
        super("Rene", "Elizalde", 34);
        setSueldo(s);
    }
    @Override
    public void setEdad (int e){
        if(e<18) {
            edad = 18;
        }else{
            edad = e;
        }
    }
    public Profesor(String n, String a, int e, double s) {
        super(n, a, e);
        setSueldo(s);
    }
    
    public void setSueldo(double s){
        sueldo = s;
    }
    
    public double getSueldo(){
        return sueldo;
    }
 @Override
    public String toString(){
    
        return String.format("%s - %f", super.toString(), getSueldo());
    }
}
