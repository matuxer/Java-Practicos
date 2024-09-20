package ParteB.Ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int montoPrestamo, cuotaMensual;
        double tasaIntereses, totalPago = 0;
        Scanner t = new Scanner(System.in);
        Scanner l = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        System.out.println("Ingrese el monto del prestamo");
        montoPrestamo = l.nextInt();
        System.out.println("Ingrese la cantidad de meses");
        cuotaMensual = n.nextInt();
        System.out.println("Ingresa la tasa de interes mensual");
        tasaIntereses = t.nextInt();
        for (int i = 0; i < cuotaMensual; i++){
            totalPago = montoPrestamo / cuotaMensual + (tasaIntereses / 100) * (montoPrestamo / cuotaMensual);
        }
        System.out.printf("%nEl valor total de la cuota es de %.2f", totalPago);
    }
}
