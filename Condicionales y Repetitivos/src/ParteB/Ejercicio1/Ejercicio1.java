package ParteB.Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("cuanto dinero gana el joven? ");
        int sueldo = scanner.nextInt();
        System.out.println("cuanto porsentaje del sueldo quiere ahorrar por mes? ");
        float ahorro = scanner.nextInt();
        System.out.println("cuantos meses va a ahorrar? ");
        int meses = scanner.nextInt();
        float ahorroAcumulado =0;
        for (int i = 1; i <= meses; i++) {
            float ahorrado = sueldo * (ahorro / 100);
            ahorroAcumulado += ahorrado;

        }
        System.out.println("En "+ meses + " mese/s ahorro un total de $"+ ahorroAcumulado );
    }
}
