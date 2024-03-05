package exercicios;

import java.util.Scanner;

public class TP01Ex08 {

    public static void ex08() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o valor em milhas maritimas:");
        double milhas = scanner.nextDouble();
    
        double metros = milhas * 1852;
        double quilometros = metros / 1000;
    
        System.out.println("O valor em quilômetros é: " + quilometros);
    }

    
}
