package taller_6;
import java.util.Scanner;
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner c = new Scanner( System.in);
        System.out.println("Ingrese un numero:");
        int n;
        n = c.nextInt();
        if (n == 1)
            System.out.println("La operacion es una suma");
        else if (n == 2)
            System.out.println("La operacion es una resta");
        else if (n == 3)
            System.out.println("La operacion es una multiplicacion");
        else if (n == 3)
            System.out.println("La operacion es una division");
    }
}
