/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ejm;

/**
 *
 * @author Daniela
 */
public class Asignatura_Presencial extends Asignatura {

    private int numero_horas;

    public Asignatura_Presencial(String n, String t, int c, int num_horas) {
        super(n, t, c);
        setNumero_horas(num_horas);
    }

    public void setNumero_horas(int num_horas) {
        numero_horas = num_horas;
    }

    public int getNumero_horas() {
        return numero_horas;
    }
    
    @Override
    public String toString(){
        return String.format("Asignatura Presencial:\n%s\nNúmero horas: %d",super.toString(),getNumero_horas());
    }
}
