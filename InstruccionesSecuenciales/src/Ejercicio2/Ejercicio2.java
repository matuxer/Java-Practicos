package Ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double parcial1, parcial2, parcial3, examenFinal, trabajoFinal, promedioParciales, calificacionFinal;

        System.out.print("Ingresa la calificación del primer parcial: ");
        parcial1 = scanner.nextDouble();

        System.out.print("Ingresa la calificación del segundo parcial: ");
        parcial2 = scanner.nextDouble();

        System.out.print("Ingresa la calificación del tercer parcial: ");
        parcial3 = scanner.nextDouble();

        promedioParciales = (parcial1 + parcial2 + parcial3) / 3;

        System.out.print("Ingresa la calificación del examen final: ");
        examenFinal = scanner.nextDouble();

        System.out.print("Ingresa la calificación del trabajo final: ");
        trabajoFinal = scanner.nextDouble();

        calificacionFinal = (promedioParciales * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);

        System.out.printf("La calificación final es: ", calificacionFinal);
    }
}
