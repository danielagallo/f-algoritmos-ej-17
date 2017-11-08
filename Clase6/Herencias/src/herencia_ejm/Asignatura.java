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
public class Asignatura {

    private String nombre;
    private String tipo; //("Troncal", "Común")
    private int costo;

    public Asignatura(String n, String t, int c) {
        setNombre(n);
        setTipo(t);
        setCosto(c);
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public void setTipo(String t) {
        tipo = t;
    }

    public void setCosto(int c) {
        costo = c;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s\n$%d", getNombre(), getTipo(), getCosto());
    }

}
