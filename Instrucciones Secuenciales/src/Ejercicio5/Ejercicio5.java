package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la hora de partida (HH): ");
        int horas = scanner.nextInt();

        System.out.print("Ingresa los minutos de partida (MM): ");
        int minutos = scanner.nextInt();

        System.out.print("Ingresa los segundos de partida (SS): ");
        int segundos = scanner.nextInt();

        System.out.print("Ingresa el tiempo de viaje en segundos (T): ");
        int tiempoViaje = scanner.nextInt();

        int tiempoPartidaEnSegundos = horas * 3600 + minutos * 60 + segundos;

        int tiempoTotalEnSegundos = tiempoPartidaEnSegundos + tiempoViaje;

        int horasLlegada = (tiempoTotalEnSegundos / 3600) % 24;
        int minutosLlegada = (tiempoTotalEnSegundos % 3600) / 60;
        int segundosLlegada = tiempoTotalEnSegundos % 60;

        System.out.printf("La hora de llegada es %02d:%02d:%02d%n", horasLlegada, minutosLlegada, segundosLlegada);
    }
}
