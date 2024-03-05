package exercicios;

import java.util.Scanner;

public class Ex02 {

    public static void ex02() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da aresta do quadrado:");
        double aresta = scanner.nextDouble();

        double area = Math.pow(aresta, 2);

        System.out.println("A área do quadrado é: " + area);
    }
    
}
