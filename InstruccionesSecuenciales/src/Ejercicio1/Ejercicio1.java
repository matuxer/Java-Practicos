package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        double sueldoBase, extra, total;
        int ventas;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su sueldo base del mes:");
        sueldoBase= input.nextDouble();

        System.out.println("Ingrese su cantidad de ventas este mes:");
        ventas= input.nextInt();

        extra = (sueldoBase * (ventas * 10)) / 100;
        total = sueldoBase + extra;

        System.out.println("El extra por comision de ventas del mes es: $" + extra);
        System.out.println("El sueldo total del mes es de: $" + total);
    }
}
