/**
 * Segundo programa de refresco de formación en Java.
 * @author yofeliz
 */
import java.util.Scanner;

public class Aritmetica {
    public static void main (String args[]) {
        int i, j;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce el primer número:  ");
            i = scanner.nextInt();
            System.out.print("Introduce el segundo número: ");
            j = scanner.nextInt();
            
            System.out.println("Suma:           " + (i+j));
            System.out.println("Resta:          " + (i-j));
            System.out.println("Multiplicación: " + (i*j));
            System.out.println("División:       " + (i/j));
            System.out.println("Módulo:         " + (i%j));
        }        
    }
}