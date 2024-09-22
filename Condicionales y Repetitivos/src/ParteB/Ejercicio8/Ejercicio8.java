package ParteB.Ejercicio8;

import java.util.Scanner;

//Simulador de Compra de Vivienda
public class Ejercicio8 {
 public static void main(String[]args){
     Scanner l = new Scanner(System.in);

     System.out.print("Ingrese el precio de la vivienda: ");
     double precioVivienda = l.nextDouble();

     System.out.print("Ingrese el porcentaje de pago inicial (sin %): ");
     double porcentajePagoInicial = l.nextDouble() / 100;

     System.out.print("Ingrese la tasa de interés anual (sin %): ");
     double tasaInteresAnual = l.nextDouble() / 100;

     System.out.print("Ingrese cuantos años va a durar el prestamo: ");
     int plazoAños = l.nextInt();


     double pagoInicial = precioVivienda * porcentajePagoInicial;
     double montoPrestamo = precioVivienda - pagoInicial;
     double tasaInteresMensual = tasaInteresAnual / 12;
     int numeroPagos = plazoAños * 12;


     double cuotaMensual;
     if (tasaInteresMensual > 0) {
         cuotaMensual = (montoPrestamo * tasaInteresMensual) /
                 (1 - Math.pow(1 + tasaInteresMensual, -numeroPagos));
     } else {
         cuotaMensual = montoPrestamo / numeroPagos;
     }


     System.out.printf("\nDetalles de la compra de la vivienda:\n");
     System.out.printf("Precio de la vivienda: $%.2f\n", precioVivienda);
     System.out.printf("Pago inicial: $%.2f\n", pagoInicial);
     System.out.printf("Monto del préstamo: $%.2f\n", montoPrestamo);
     System.out.printf("Cuota mensual: $%.2f\n", cuotaMensual);
     System.out.printf("Total a pagar en %d años: $%.2f\n", plazoAños, cuotaMensual * numeroPagos);



 }
}