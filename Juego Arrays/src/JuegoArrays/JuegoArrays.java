package JuegoArrays;

import java.util.Random;
import java.util.Scanner;

public class JuegoArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Elige la dificultad:");
        System.out.println("1. Fácil (array de tamaño 3)");
        System.out.println("2. Medio (array de tamaño 5)");
        System.out.println("3. Difícil (array de tamaño 8)");

        int arraySize = 0;

        while (arraySize == 0) {
            int dificultad = input.nextInt();

            switch (dificultad) {
                case 1:
                    arraySize = 3;
                    break;
                case 2:
                    arraySize = 5;
                    break;
                case 3:
                    arraySize = 8;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    System.out.println("Vuelva a intentarlo:");
                    break;
            }
        }

        int[] jugador = new int[arraySize];
        int[] maquina = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            jugador[i] = random.nextInt(50) + 1;
            maquina[i] = random.nextInt(50) + 1;
        }

        int puntosJugador = 0;
        int puntosMaquina = 0;

        for (int i = 0; i < arraySize; i++) {
            System.out.println("\nBatalla " + (i + 1) + ": Jugador (" + jugador[i] + ") vs Maquina (" + maquina[i] + ")");
            if (jugador[i] > maquina[i]) {
                puntosJugador++;
                System.out.println("Ganador de esta batalla: Jugador!");
            } else if (maquina[i] > jugador[i]) {
                puntosMaquina++;
                System.out.println("Ganador de esta batalla: Maquina!");
            } else {
                System.out.println("Empate en esta batalla");
            }
        }

        System.out.println("\nResultado final:");
        if (puntosJugador > puntosMaquina) {
            System.out.println("Jugador gana con " + puntosJugador + " puntos!");
        } else if (puntosMaquina > puntosJugador) {
            System.out.println("Maquina gana con " + puntosMaquina + " puntos!");
        } else {
            System.out.println("Es un empate!");
        }

        input.close();

    }

}
