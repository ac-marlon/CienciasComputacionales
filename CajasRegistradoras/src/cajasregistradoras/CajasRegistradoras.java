/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajasregistradoras;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author FamiliaHogar
 */
public class CajasRegistradoras {

    public static void main(String[] args) {
        int nCliente = 1;
        boolean continuar;
        int clientesRegUno;
        int clientesRegDos;
        int clientesRegTres;

        /*Creamos las Colas de supermercado en las cajas registradoras*/
        Queue<Integer> colaRegisUno = new LinkedList();
        Queue<Integer> colaRegisDos = new LinkedList();
        Queue<Integer> colaRegisTres = new LinkedList();
        
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("A que caja registradora desea asignar al cliente N° " + nCliente);
            System.out.println("1. Primera Caja Registradora \n 2. Segunda Caja Registradora \n "
                    + "3. Tercera Caja Registradora \n 4. Caja de Menor Cola \n");
            int opcion = s.nextInt();

            /*Insertamos datos en la cola*/
            switch (opcion) {
                case 1:
                    colaRegisUno.add(nCliente);
                    break;
                case 2:
                    colaRegisDos.add(nCliente);
                    break;
                case 3:
                    colaRegisTres.add(nCliente);
                    break;
                case 4:
                    clientesRegUno = colaRegisUno.size();
                    clientesRegDos = colaRegisDos.size();
                    clientesRegTres = colaRegisTres.size();
                    if (clientesRegUno <= clientesRegDos && clientesRegUno <= clientesRegTres) {
                        colaRegisUno.add(nCliente);
                    } else if (clientesRegDos <= clientesRegUno && clientesRegDos <= clientesRegTres) {
                        colaRegisDos.add(nCliente);
                    } else {
                        colaRegisTres.add(nCliente);
                    }
                    break;
                default:
                    System.out.println("¡Eleccion invalida!");
            }
            System.out.println("Las colas quedan asi: ");
            System.out.println("Cola 1: " + colaRegisUno);
            System.out.println("Cola 2: " + colaRegisDos);
            System.out.println("Cola 3: " + colaRegisTres);
            System.out.println("¿Desea añadir otro cliente?");
            continuar = s.nextBoolean();
            nCliente++;
        } while (continuar == true);
    }
}
