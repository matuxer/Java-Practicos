package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int dd, mm, aa, total;
        String suma;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingresar su día de nacimiento (DD): ");
        dd = input.nextInt();

        System.out.println("Ingresar su mes de nacimiento (MM): ");
        mm = input.nextInt();

        System.out.println("Ingresar su año de nacimiento (AA): ");
        aa = input.nextInt();

        total = dd + mm + aa;

        suma = Integer.toString(total);

        while (suma.length() > 1) {
            total = 0;

            for (int i = 0; i < suma.length(); i++) {
                total += Character.getNumericValue(suma.charAt(i));
            }

            suma = Integer.toString(total);
        }

        System.out.println("Su número de la suerte es: " + suma);
    }
}
