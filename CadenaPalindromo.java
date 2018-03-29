/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cadenaspalindromo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AC-Marlon
 */

public class CadenasPalindromo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String cadena;
        ArrayList<String> letras1 = new ArrayList<>();
        ArrayList<String> letras2 = new ArrayList<>();
        ArrayList<String> palindromo1;
        ArrayList<String> palindromo2;
        cadena = s.nextLine();
        if (esPalindromo(cadena)) {
        } else {
            for (int i = 0; i < cadena.length(); i++) {
                letras1.add(Character.toString(cadena.charAt(i)));
                letras2.add(Character.toString(cadena.charAt(i)));
            }
        }
        palindromo1 = sustitucionesPalindromo(letras1);
        palindromo2 = insercionesPalindromo(letras2);     
        System.out.println("Palindromo por sustituciones : " + palindromo1);
        System.out.println("Palindromo por inserciones : " + palindromo2);
    }

    public static boolean esPalindromo(String cadena) {
        String aux = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            aux = aux + cadena.charAt(i);
        }
        return cadena.equals(aux);
    }

    private static ArrayList<String> sustitucionesPalindromo(ArrayList<String> letras) {
        for (int i = 1; i < letras.size(); i++) {
            if (!letras.get(i - 1).equals(letras.get(letras.size() - i))) {
                letras.set(letras.size() - i, letras.get(i - 1));
            }
        }
        return letras;
    }

    private static ArrayList<String> insercionesPalindromo(ArrayList<String> letras) {
        for (int i = 1; i < letras.size(); i++) {
            if (!letras.get(i - 1).equals(letras.get(letras.size() - i))) {
                letras.add(letras.size() - i + 1, letras.get(i - 1));
            }
        }
        return letras;
    }
}
