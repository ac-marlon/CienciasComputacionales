package compracambio;

import java.util.Scanner;

public class CompraCambio {

    public static void main(String[] args) {

        int precioArticulo, pagoEfectivo, cambioEfectivo;
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca el precio del artículo: ");
        precioArticulo = s.nextInt();
        System.out.println("Introduzca el pago en efectivo: ");
        pagoEfectivo = s.nextInt();

        if (pagoEfectivo < 0 || precioArticulo < 0) {
            System.out.println("Solo se permiten montos positivos.");
        } else if (pagoEfectivo < precioArticulo) {
            System.out.println("El pago debe ser igual o superior al precio del artículo.");
        } else {
            cambioEfectivo = pagoEfectivo - precioArticulo;
            System.out.println("El valor del cambio es: " + cambioEfectivo);
        }
    }

}
