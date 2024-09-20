package ParteA.Ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < 10; i++) {
            a = b + c;
            b = c;
            c = a;
            System.out.println(a);
        }
    }
}
