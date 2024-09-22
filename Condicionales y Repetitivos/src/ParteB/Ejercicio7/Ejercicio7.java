package ParteB.Ejercicio7;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        ArrayList<String> deportes = new ArrayList<>();
        ArrayList<Integer> horas = new ArrayList<>();

        System.out.println("Ingrese cuántos deportes hace:");
        int depor = l.nextInt();

        l.nextLine();

        for (int i = 0; i < depor; i++) {
            System.out.println("Ingrese su deporte " + (i + 1) + ":");

            String deporte = l.nextLine();
            deportes.add(deporte);

            System.out.println("Ingrese cuántas horas a la semana dedica a " + deporte + ":");
            int hora = l.nextInt();
            horas.add(hora);
            l.nextLine();
        }

        System.out.println("\nResumen de actividades deportivas:");
        for (int i = 0; i < deportes.size(); i++) {
            System.out.println("Deporte: " + deportes.get(i) + ", Horas a la semana: " + horas.get(i));
        }



    }
}
