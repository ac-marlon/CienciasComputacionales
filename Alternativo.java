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
 * @author FamiliaAC
 */
public class Alternativo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String cadena;
        ArrayList<String> letras = new ArrayList<>();
        ArrayList<String> palindromo = new ArrayList<>();
        cadena = s.nextLine();

        if (esPalindromo(cadena)) {
            System.out.println("Palindromo");
        } else {
            System.out.println("NO Palindromo");
            for (int i = 0; i < cadena.length(); i++) {
                letras.add(Character.toString(cadena.charAt(i)));
            }
        }
        palindromo = insercionesPalindromo(letras);
        System.out.println(palindromo);
    }

    public static boolean esPalindromo(String cadena) {
        String aux = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            aux = aux + cadena.charAt(i);
        }
        return cadena.equals(aux);
    }

    private static ArrayList<String> insercionesPalindromo(ArrayList<String> letras) {
        int cont = 0;
        for (int i = 1; i < letras.size(); i++) {
            if (!letras.get(i - 1).equals(letras.get(letras.size() - i))) {
                letras.set(letras.size() - i, letras.get(i - 1));
                cont++;
            }
        }
        System.out.println(cont);
        return letras;
    }

}
