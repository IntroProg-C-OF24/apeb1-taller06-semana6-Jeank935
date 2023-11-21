package taller_6;

import java.util.Scanner;

public class Taller_6 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num;
        num = tc.nextInt();
        if (num == 1) {
            System.out.println("Enero");
        } else if (num == 2) {
            System.out.println("Febrero");
        } else if (num == 3) {
            System.out.println("Marzo");
        } else if (num == 4) {
            System.out.println("Abril");
        } else if (num == 5) {
            System.out.println("Mayo");
        } else if (num == 6) {
            System.out.println("Junio");
        } else if (num == 7) {
            System.out.println("Julio");
        } else if (num == 8) {
            System.out.println("Agosto");
        } else if (num == 9) {
            System.out.println("Septiembre");
        } else if (num == 10) {
            System.out.println("Octubre");
        } else if (num == 11) {
            System.out.println("Noviembre");
        } else if (num == 12) {
            System.out.println("Diciembre");
        }else {
            System.out.println("Numero ingresado incorrecto");
        }
    }
}
