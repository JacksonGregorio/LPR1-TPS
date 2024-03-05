package exercicios;

import java.util.Scanner;

public class TP01Ex04 {

    public static void ex04() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o valor da base do triângulo:");
        double base = scanner.nextDouble();
    
        System.out.println("Digite o valor da altura do triângulo:");
        double altura = scanner.nextDouble();
    
        double area = (base * altura) / 2;
    
        System.out.println("A área do triângulo é: " + area);
    }
    
}
