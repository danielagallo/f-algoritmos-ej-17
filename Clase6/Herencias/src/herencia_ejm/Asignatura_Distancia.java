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
public class Asignatura_Distancia extends Asignatura {

    private int numero_creditos;

    public Asignatura_Distancia(String n, String t, int c, int num_creditos) {
        super(n, t, c);
        this.numero_creditos = numero_creditos;
        setNumero_creditos(num_creditos);
    }

    public void setNumero_creditos(int num_creditos) {
        numero_creditos = num_creditos;
    }

    public int getNumero_creditos() {
        return numero_creditos;
    }

    @Override
    public String toString() {
        return String.format("Asignatura Distancia:\n%s\nNúmero Créditos: %d", super.toString(), getNumero_creditos());
    }
}
