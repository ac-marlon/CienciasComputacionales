/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaindexpar;

import java.util.Scanner;

/**
 *
 * @author AC Marlon
 */
public class SumaIndexPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int longitud;
        Scanner s = new Scanner(System.in);
        longitud = s.nextInt();
        int vector[] = new int[longitud];
        rellenarVector(vector);
        imprimirVector(vector);
        System.out.println(sumarIndexPar(vector));
    }

    public static int sumarIndexPar(int vector[]) {
        int sumarParcial = 0;
        for (int i = 0; i < vector.length; i++) {
            if (i % 2 == 0) {
                sumarParcial += vector[i + 1];
            }
        }
        if (sumarParcial % 2 == 0) {
            return sumarParcial;
        } else {
            return 0;
        }
    }

    public static void rellenarVector(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }

    public static void imprimirVector(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ", ");
        }
        System.out.println("");
    }

}
