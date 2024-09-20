package ParteA.Ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese una palabra para ver si es Palíndromo");

        String palabra = input.nextLine();

        int longitud = palabra.length();

        boolean esPalindromo = true;

        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }
        if (esPalindromo){
            System.out.println("su palabra es un palindromo");
        }else{
            System.out.println("su palabra no es un palindromo");
        }
    }
}
