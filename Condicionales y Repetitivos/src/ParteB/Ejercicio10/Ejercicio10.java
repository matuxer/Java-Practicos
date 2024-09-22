package ParteB.Ejercicio10;

import java.util.Scanner;

//Simulador de Compra de Vehículo
public class Ejercicio10 {
    public static void main(String[]args) {
        int pagoAuto, autoNuevo, autoUsado, cuotas;
        double tasaAuto, totalPagar = 0;
        boolean metodoCorrecto = true;
        Scanner a = new Scanner(System.in);



        while (metodoCorrecto) {
            System.out.println("Ingrese su metodo de pago: 1)Nuevo en efectivo, 2)Nuevo en cuotas, 3)Entregando auto usado, 4)Entregando su auto en cuotas");
            pagoAuto = a.nextInt();
            switch (pagoAuto){
                case 1:
                    System.out.println("Ingrese el costo de su auto");
                    autoNuevo = a.nextInt();
                    totalPagar = autoNuevo - (autoNuevo * 0.10);
                    System.out.printf("%nEl valor total es: %.0f%n",totalPagar);
                    metodoCorrecto = false;
                    break;

                case 2:
                    System.out.println("Ingrese el costo de su auto");
                    autoNuevo = a.nextInt();
                    System.out.println("Ingrese la tasa del auto");
                    tasaAuto = a.nextInt();
                    System.out.println("Ingrese la cantidad de cuotas con las que va a pagar su auto ");
                    cuotas = a.nextInt();
                    for (int i = 0; i < cuotas; i++) {
                        totalPagar += autoNuevo / cuotas + (tasaAuto / 100) * (autoNuevo / cuotas);
                    }
                    System.out.printf("%nEl valor total es: %.2f%n", totalPagar);
                    metodoCorrecto = false;
                    break;

                case 3:
                    System.out.println("Ingrese el costo de su auto");
                    autoNuevo = a.nextInt();
                    System.out.println("Ingrese el costo de su auto usado");
                    autoUsado = a.nextInt();
                    totalPagar += autoNuevo - autoUsado;
                    System.out.printf("%nEl valor total es: %.2f%n", totalPagar);
                    metodoCorrecto = false;
                    break;

                case 4:
                    System.out.println("Ingrese el costo de su auto");
                    autoNuevo = a.nextInt();
                    System.out.println("Ingrese el costo de su auto usado");
                    autoUsado = a.nextInt();
                    System.out.println("Ingrese la cantidad de cuotas con las que va a pagar su auto ");
                    cuotas = a.nextInt();
                    System.out.println("Ingrese  la tasa del auto");
                    tasaAuto = a.nextInt();
                    for (int i = 0; i < cuotas; i++) {
                        totalPagar += (autoNuevo -  autoUsado) / cuotas +  (tasaAuto / 100) * (autoNuevo -  autoUsado);
                    }
                    System.out.printf("%nEl valor total es: %.2f%n", totalPagar);
                    metodoCorrecto = false;
                    break;

                default:
                    System.out.println("Ingrese el numero correctamente");
            }
        }

    }
}

