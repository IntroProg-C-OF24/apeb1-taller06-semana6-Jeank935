package taller_6;
import java.util.Scanner;
public class CostoEnvio_04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double region, peso;
        System.out.println("Ingrese la region 1 para nacional 2 para local");
        region = teclado.nextDouble();
        System.out.println("Ingrese el peso");
        peso = teclado.nextDouble();
        if (region == 1)
            System.out.println("La region es nacional");
        else if (region == 2)
            System.out.println("La region es local");
        else
            System.out.println("numero ingresado incorrecto");
            
        if (peso < 5 && region == 1  ) 
            System.out.println("el costo es de $5");
        else if (peso <= 10 && region == 2)
            System.out.println("El costo es de $10");
        else
            System.out.println("El costo es de $15");
    }
    
}
