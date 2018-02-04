/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenarvector;

/**
 *
 * @author AC Marlon
 */
public class OrdenarVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int longitud = 100;
        int vector[] = new int[longitud];
        rellenarVector(vector);
        //rellenarVectorOrdenadoAsc(vector);
        //rellenarVectorOrdenadoDes(vector);
        //imprimirVector(vector);
        //llamadaInsercion(vector);
        //llamadaSeleccion(vector);
    }

    public static void llamadaInsercion(int vector[]) {
        //Se toma el tiempo del Algoritmo de Insercion:
        double tInicio, tFinal;
        tInicio = System.nanoTime();
        metodoInsercion(vector); // Llamada al metodo
        tFinal = System.nanoTime();
        System.out.println("El Algoritmo se Insercion dura: " + (tFinal - tInicio) + " nanosegundos");
        System.out.println("El Algoritmo se Insercion dura: " + (tFinal - tInicio) / 1000000000 + " segundos");
        //imprimirVector(vector);
    }

    public static void llamadaSeleccion(int vector[]) {
        //Se toma el tiempo del Algoritmo de Insercion:
        double tInicio, tFinal;
        tInicio = System.nanoTime();
        metodoSeleccion(vector); // Llamada al metodo
        tFinal = System.nanoTime();
        System.out.println("El Algoritmo se Seleccion dura: " + (tFinal - tInicio) + " nanosegundos");
        System.out.println("El Algoritmo se Seleccion dura: " + (tFinal - tInicio) / 1000000000 + " segundos");
        //imprimirVector(vector);
    }

    public static void rellenarVector(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
    }

    public static void rellenarVectorOrdenadoAsc(int vector[]) {
        int aux = 1;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = aux;
            aux++;
        }
    }

    public static void rellenarVectorOrdenadoDes(int vector[]) {
        int aux = vector.length;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = aux;
            aux--;
        }
    }

    public static void imprimirVector(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i] + ", ");
        }
    }

    private static void metodoInsercion(int[] vector) {
        int i, aux, index;
        for (i = 1; i < vector.length; i++) {
            index = vector[i];
            aux = i - 1;
            while (aux >= 0 && vector[aux] > index) {
                vector[aux + 1] = vector[aux];
                aux--;
            }
            vector[aux + 1] = index;
        }
    }

    private static void metodoSeleccion(int[] vector) {
        for (int i = 0; i < vector.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j] < vector[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int aux = vector[i];
                vector[i] = vector[min];
                vector[min] = aux;
            }
        }
    }
}
