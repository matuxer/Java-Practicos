package ParteB.Ejercicio6;

import java.util.Scanner;
//Planificador de Estudio

public class Ejercicio6 {

        public static void main(String[] args) {
            Scanner l = new Scanner(System.in);
            String materia = "";
            int horas = 0;
            boolean a = true;
            String b;
            String momento = null;

            while (a) {
                System.out.println("Ingrese qué materia quiere estudiar:");
                materia = l.nextLine();

                System.out.println("Ingrese cuántas horas quiere estudiar:");
                horas = l.nextInt();
                l.nextLine();

                System.out.println("Ingrese en qué momento quiere estudiar (mañana, tarde o noche):");
                momento = l.nextLine();

                System.out.println("¿Quiere cambiar de materia? (si/no):");
                b = l.nextLine();

                if (b.equalsIgnoreCase("no")) {
                    a = false;
                }
            }

            System.out.println("La materia que vas a estudiar es: " + materia);
            System.out.println("Las horas que vas a estudiar son: " + horas);
            System.out.println("El momento que vas a estudiar es: " + momento);

        }
}
