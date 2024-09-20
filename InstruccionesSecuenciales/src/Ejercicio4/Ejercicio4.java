package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double v1, v2, d, tiempo;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la distancia entre el vehiculo 1 y el vehiculo 2 (km): ");
        d = input.nextDouble();

        System.out.println("Ingrese la velocidad del primer vehiculo 1 (km/h): ");
        v1 = input.nextDouble();

        System.out.println("Ingrese la velocidad del primer vehiculo 2 (km/h): ");
        v2 = input.nextDouble();

        if (v1 > v2) {
            tiempo = (d / (v1 - v2)) * 60;
        } else {
            tiempo = (d / (v2 - v1)) * 60;
        }

        System.out.println("El vehículo más rápido alcanzará al otro en: " + tiempo + " minutos");
    }
}
