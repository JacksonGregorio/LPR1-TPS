package exercicios;

import java.util.Scanner;

public class TP01Ex17 {

     public static void ex17() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o valor de X:");
        double x = scanner.nextDouble();
    
        System.out.println("Digite o valor de Y:");
        double y = scanner.nextDouble();
    
        double resultado = Math.pow(x, y);
    
        System.out.println("O resultado de X elevado a Y é: " + resultado);
    }
    
}
