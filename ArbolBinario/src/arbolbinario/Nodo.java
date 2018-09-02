/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author FamiliaHogar
 */
public class Nodo {

    private String nombre;
    private int dato;
    private Nodo izq;
    private Nodo der;
    private Nodo padre;

    //Constructor 
    public Nodo(String nombre, int dato) {
        this.nombre = nombre;
        this.dato = dato;
    }
    //Para saber el nodo izquierdo

    public Nodo getNodoIzquierdo() {
        return izq;
    }
    //Para saber el nodo derecho

    public Nodo getNodoDerecho() {
        return der;
    }
    //Se crea nodo derecho

    public void setNodoDerecho(Nodo nodo) {
        der = nodo;
    }
    //Se crea nodo Izquierdo

    public void setNodoIzquierdo(Nodo nodo) {
        izq = nodo;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }
}
