package exercicios;

import java.util.Scanner;

public class Ex01 {

     public static void ex01() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base do retângulo:");
        double base = scanner.nextDouble();

        System.out.println("Digite a altura do retângulo:");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("A área do retângulo é: " + area);
    }
    
    
}
