package ParteB.Ejercicio2;

import java.util.Scanner;

// Simulador de Ahorro:
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.println("Ingrese cuánto presupuesto tiene:");
        int a = l.nextInt();
        l.nextLine();

        boolean b = true;
        int t = 0;
        String d;

        while (b) {

            System.out.println("Ingrese cuánto ha gastado:");
            int c = l.nextInt();
            l.nextLine();

            t += c;

            System.out.println("Si quiere agregar más gastos ingrese 's'; si no, ingrese 'n':");
            d = l.nextLine();


            if (d.equals("n")) {
                int f = a - t;
                System.out.println("Se ha gastado: " + t);
                System.out.println("Queda: " + f);
                b = false;
            }
        }


    }
}
