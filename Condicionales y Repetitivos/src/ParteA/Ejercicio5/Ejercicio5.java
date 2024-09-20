package ParteA.Ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[]args){
        Scanner l = new Scanner(System.in);
        String a ;

        System.out.println("ingrese el numero que necesita saber cuantos digitos tiene");

        a= l.nextLine();

        int digitos = a.length();

        System.out.println("la cantidad de digitos de su numero es "+ digitos);
    }
}
