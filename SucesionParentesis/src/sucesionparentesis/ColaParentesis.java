/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sucesionparentesis;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author FamiliaHogar
 */
public class ColaParentesis {

    public static void main(String[] args) {
        String sucesionParentesis;
        boolean banderaPaso = true;
        int contador = 0;

        /*Creamos la Pila Indicando el tipo de dato*/
        Stack<Character> pilaParentesis = new Stack<>();

        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca una sucesion de parentesis: ");
        sucesionParentesis = s.nextLine();

        /*Insertamos datos en la pila*/
        for (int i = 0; i < sucesionParentesis.length(); i++) {
            if (sucesionParentesis.charAt(i) == '(' || sucesionParentesis.charAt(i) == ')') {
                pilaParentesis.push(sucesionParentesis.charAt(i));
            } else {
                banderaPaso = false;
                System.out.println("¡La entrada es invalida, solo se aceptan parentesis!");
                break;
            }
        }

        /*Estructura repetitiva para desapilar*/
        if (banderaPaso == true) {
            System.out.println("Pila: " + pilaParentesis);
            while (!pilaParentesis.empty()) {
                if (pilaParentesis.peek() == '(') {
                    contador++;
                } else {
                    contador--;
                }
                pilaParentesis.pop();
            }
            if (contador == 0) {
                System.out.println("La sucesion esta equilibrada");
            } else {
                System.out.println("No hay equilibrio en la entrada de parentesis");
            }
        }
    }
}
