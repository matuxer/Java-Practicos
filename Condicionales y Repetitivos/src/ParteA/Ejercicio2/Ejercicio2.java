package ParteA.Ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] vocales = {"a", "e", "i", "o", "u"};

        System.out.print("Introduce una palabra: ");

        String palabra = input.nextLine().toLowerCase();

        int contador = 0;


        for (int i = 0; i < palabra.length(); i++) {
            String letra = palabra.substring(i, i + 1);

            for (String vocal : vocales) {
                if (letra.equals(vocal)) {
                    contador++;
                    break;
                }
            }
        }

        System.out.println("Número de vocales en la palabra: " + contador);


    }
}
