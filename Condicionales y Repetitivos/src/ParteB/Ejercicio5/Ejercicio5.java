package ParteB.Ejercicio5;

import java.util.Scanner;

//Calculadora de Calorías
public class Ejercicio5 {
    public static void main(String[]args){
        Scanner l = new Scanner(System.in);
        System.out.println("ingrese cuantas calorias a consumido en todo el dia");
        int calorias = l.nextInt();
        if (calorias <= 1200 || calorias > 3200) {
            System.out.println("El joven no esta dentro de un rango saludable.");
        }else
            System.out.println("El joven esta dentro de un rango saludable.");
    }
}