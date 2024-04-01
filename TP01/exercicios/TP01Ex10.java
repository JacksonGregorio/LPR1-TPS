package TP01.exercicios;

import java.util.Scanner;

public class TP01Ex10 {

    public static void ex10() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite a temperatura em graus Celsius:");
        double celsius = scanner.nextDouble();
    
        double fahrenheit = (celsius * 9/5) + 32;
    
        System.out.println("a temperatura em Farenheit é: " + fahrenheit);
    }
    
}
