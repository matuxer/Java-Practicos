package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int num1, num2, auxiliar;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el número A: ");
        num1 = input.nextInt();

        System.out.println("Ingrese el número B: ");
        num2 = input.nextInt();

        System.out.println(" los números originales son ");
        System.out.println(" A = " + num1);
        System.out.println(" B = " + num2);

        auxiliar = num1;
        num1 = num2;
        num2 = auxiliar;

        System.out.println("El nuevo número de A es " + num1 + " y el nuevo número de B es " + num2);

    }
}
