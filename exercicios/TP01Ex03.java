package exercicios;

import java.util.Scanner;

public class TP01Ex03 {

     public static void ex03() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o valor da diagonal do quadrado:");
        double diagonal = scanner.nextDouble();
    
        double area = (diagonal * diagonal) / 2;
    
        System.out.println("A área do quadrado é: " + area);
    }
    
}
