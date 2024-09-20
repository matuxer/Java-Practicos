package JuegoTATETI;
import java.util.Random;
import java.util.Scanner;

public class JuegoTATETI {
    public static void main(String[] args) {
        int jugador1, jugador2;
        jugador1 = 0;
        jugador2 = 0;
        piedraPapelTijera(jugador1, jugador2);

    }

    public static void piedraPapelTijera(int jugador1, int jugador2) {
        Scanner input = new Scanner(System.in);
        Random maquina = new Random();

        System.out.println("1:Piedra, 2:Papel, 3:Tijera ");

        jugador1 = input.nextInt();
        jugador2 = maquina.nextInt(1, 3);

        do {
            switch (jugador1) {
                case 1:
                    System.out.println("piedra");
                    break;
                case 2:
                    System.out.println("papel");
                    break;
                case 3:
                    System.out.println("tijera");
                    break;
                default:
                    System.out.println("consigna incorrecta");
                    break;
            }
        } while (jugador1 < 1 || jugador1 > 3);

        switch (jugador2) {
            case 1:
                System.out.println("piedra");
                break;
            case 2:
                System.out.println("papel");
                break;
            case 3:
                System.out.println("tijera");
                break;
        }

        if (jugador1 == 1 && jugador2 == 2) {
            System.out.println("perdiste");
        } else if (jugador1 == 1 && jugador2 == 3) {
            System.out.println("ganaste");
        } else if (jugador1 == 2 && jugador2 == 1) {
            System.out.println("ganaste");
        } else if (jugador1 == 2 && jugador2 == 3) {
            System.out.println("perdiste");
        } else if (jugador1 == 3 && jugador2 == 1) {
            System.out.println("perdiste");
        } else if (jugador1 == 3 && jugador2 == 2) {
            System.out.println("ganaste");
        } else {
            System.out.println("empate");
        }

    }
}