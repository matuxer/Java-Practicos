package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu primer apellido: ");
        String apellido1 = scanner.nextLine();

        System.out.print("Ingresa tu segundo apellido: ");
        String apellido2 = scanner.nextLine();

        char inicialNombre = nombre.charAt(0);
        char inicialApellido1 = apellido1.charAt(0);
        char inicialApellido2 = apellido2.charAt(0);

        System.out.printf("Tus iniciales son: %c%c%c%n", inicialNombre, inicialApellido1, inicialApellido2);
    }
}
