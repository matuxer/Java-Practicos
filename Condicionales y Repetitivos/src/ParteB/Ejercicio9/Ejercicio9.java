package ParteB.Ejercicio9;

import java.util.Scanner;

//Calculadora de Tiempo de Estudio:
public class Ejercicio9 {
 public static void main(String[]args){
     Scanner l = new Scanner(System.in);
     boolean a = true;
     String materia = " ";
     int horas= 0;

     System.out.println("ingrese la materia que tiene que estudiar");
     materia = l.nextLine();

     while (a){

         System.out.println("ingrese las horas de estudio");
          horas= l.nextInt();

         if (horas < 2) {
             System.out.println("no son horas suficientes para aprender el tema");
         }else{
             System.out.println("son horas suficientes para aprender el tema ");
             a=false;
         }
     }
     System.out.println("la materia a estudiar son: "+ materia + " y las horas de estudio son: " + horas );
}
}