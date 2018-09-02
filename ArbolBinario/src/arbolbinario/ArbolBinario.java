/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author FamiliaHogar
 */
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreNodo;
        String nombreNodoPadre;
        Nodo nodoPadre = null;
        String orientacion;
        int datoNodo;
        boolean continuar;

        ArrayList<Nodo> listaNodos = new ArrayList<>();
        Scanner l = new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        System.out.println("Dato de la raiz: ");
        datoNodo = s.nextInt();
        Nodo Raiz = new Nodo("Raiz", datoNodo);
        listaNodos.add(Raiz);

        do {
            System.out.println("Lista de nodos que componen el arbol:");
            Iterator<Nodo> nombreIterator = listaNodos.iterator();
            while (nombreIterator.hasNext()) {
                Nodo elemento = nombreIterator.next();
                System.out.print(elemento.getNombre() + " / ");
            }
            System.out.println("¿Desea añadir un nodo?");
            continuar = s.nextBoolean();

            if (continuar) {
                System.out.println("Nombre del nuevo nodo: ");
                nombreNodo = l.nextLine();
                System.out.println("Dato del nuevo nodo: ");
                datoNodo = s.nextInt();
                System.out.println("Nombre del nodo padre: ");
                nombreNodoPadre = l.nextLine();
                for (int i = 0; i < listaNodos.size(); i++) {
                    if (nombreNodoPadre.equals(listaNodos.get(i).getNombre())) {
                        nodoPadre = listaNodos.get(i);
                    }
                }
                System.out.println("Orientacion del nuevo nodo (izq / der)");
                orientacion = l.nextLine();
                listaNodos.add(crearNodo(nombreNodo, datoNodo, nodoPadre, orientacion));
            }

        } while (continuar == true);

        //Resultado en pantalla
        System.out.println("Recorrido Preorden: ");
        preOrden(Raiz);
        System.out.println("Recorrido Inorden: ");
        inorden(Raiz);
        System.out.println("Recorrido PostOrden: ");
        posOrden(Raiz);
        System.out.println("Suma de todos los elementos:");
        sumarElementos(listaNodos);
        System.out.println("Suma de los elementos multiplos de tres:");
        sumarElementosMultTres(listaNodos);

    }

    //Metodo crear nodo
    private static Nodo crearNodo(String nombreNodo, int datoNodo, Nodo nodoPadre, String orientacion) {
        Nodo nomNodo = new Nodo(nombreNodo, datoNodo);
        if (orientacion.equals("izq")) {
            nodoPadre.setNodoIzquierdo(nomNodo);
        } else {
            nodoPadre.setNodoDerecho(nomNodo);
        }
        return nomNodo;
    }

    //Metodo Preorden
    private static void preOrden(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.getDato() + " - ");
            preOrden(raiz.getNodoIzquierdo());
            preOrden(raiz.getNodoDerecho());
        }
    }

    //Metodo Inorden
    private static void inorden(Nodo raiz) {
        if (raiz != null) {
            inorden(raiz.getNodoIzquierdo());
            System.out.print(raiz.getDato() + " - ");
            inorden(raiz.getNodoDerecho());
        }
    }

    //Metodo PostOrden
    private static void posOrden(Nodo raiz) {
        if (raiz != null) {
            posOrden(raiz.getNodoIzquierdo());
            posOrden(raiz.getNodoDerecho());
            System.out.print(raiz.getDato() + " - ");
        }
    }

    //Sumar todos los elementos
    private static void sumarElementos(ArrayList<Nodo> listaNodos) {
        int sumaTotal = 0;
        for (int i = 0; i < listaNodos.size(); i++) {
            sumaTotal = sumaTotal + listaNodos.get(i).getDato();
        }
        System.out.println(sumaTotal);
    }

    //Sumar los elementos multiplos de tres
    private static void sumarElementosMultTres(ArrayList<Nodo> listaNodos) {
        int sumaTotal = 0;
        for (int i = 0; i < listaNodos.size(); i++) {
            if (listaNodos.get(i).getDato() % 3 == 0) {
                sumaTotal = sumaTotal + listaNodos.get(i).getDato();
            }
        }
        System.out.println(sumaTotal);
    }

}
