package ParteB.Ejercicio3;


import java.util.Scanner;

// Planificador de Viajes
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        String destino;
        double costo;
        int duracion = 0;

        System.out.println("¡Bienvenido a tu planificador de viaje!");

        while (true) {
            System.out.print("Ingresa el destino (o escribe 'salir' para terminar): ");
            destino = l.nextLine();

            if (destino.equalsIgnoreCase("salir")) {
                break;
            }
            System.out.print("Ingrese el costo del viaje: ");
            costo = l.nextDouble();

            System.out.print("Ingrese la duración del viaje (en días): ");
            duracion = l.nextInt();
            l.nextLine();

            System.out.printf("\nDestino: %s, Costo: $%.2f, Duración: %d días%n", destino, costo, duracion);
        }


    }
}
