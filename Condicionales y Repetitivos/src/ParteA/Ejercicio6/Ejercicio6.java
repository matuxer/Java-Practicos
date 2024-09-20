package ParteA.Ejercicio6;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.println("Introduce la cadena principal: ");
        String primeracadena = l.nextLine();

        primeracadena = primeracadena.toLowerCase();

        System.out.println("Introduce la subcadena a buscar: ");
        String subcadena = l.nextLine();

        subcadena = subcadena.toLowerCase();
        int posicion = -1;
        for (int i = 0; i <= primeracadena.length() - subcadena.length(); i++) {

            String subcadenaActual = primeracadena.substring(i, i + subcadena.length());

            if (subcadenaActual.equals(subcadena)) {
                posicion = i;
                break;
            }
        }

        if (posicion != -1) {
            System.out.println("La subcadena se encuentra en la posición: " + posicion);
        } else {
            System.out.println("La subcadena no se encuentra en la cadena principal.");
        }

    }
}
