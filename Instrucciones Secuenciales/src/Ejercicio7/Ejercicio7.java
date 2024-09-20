package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de respuestas correctas: ");
        int correctas = scanner.nextInt();

        System.out.print("Ingresa el número de respuestas incorrectas: ");
        int incorrectas = scanner.nextInt();

        System.out.print("Ingresa el número de respuestas en blanco: ");
        int enBlanco = scanner.nextInt();

        int notaFinal = (correctas * 5) + (incorrectas * -1) + (enBlanco * 0);

        System.out.println("La nota final del estudiante es: " + notaFinal);
    }
}
