/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package cadenaspalindromo;

import java.util.Scanner;

/**
 *
 * @author AC Marlon
 */
public class CadenasPalindromo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String cadena;
        cadena = s.nextLine();

        if (esPalindromo(cadena)) {
            System.out.println("Palindromo");
        } else {
            System.out.println("NO Palindromo");
        }

        cadena = modCadena(cadena, 0, cadena.length() - 1);
        System.out.println(cadena);

    }

    public static boolean esPalindromo(String cadena) {
        String aux = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            aux = aux + cadena.charAt(i);
        }
        return cadena.equals(aux);
    }

    public static String modCadena(String cadena, int inf, int sup) {

        if (inf == sup) {
            return Character.toString(cadena.charAt(inf));
        }

        int medio = (inf + sup) / 2;
        String subCadenaIzq = modCadena(cadena, inf, medio);
        //System.out.println(subCadenaIzq);
        String subCadenaDer = modCadena(cadena, medio + 1, sup);
        //System.out.println(subCadenaDer);
        System.out.println("C1: " + subCadenaIzq + " // C2: " + subCadenaDer);

        return subCadenaIzq + subCadenaDer;
    }

}
