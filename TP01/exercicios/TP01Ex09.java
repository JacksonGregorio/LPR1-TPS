package TP01.exercicios;

import java.util.Scanner;

public class TP01Ex09 {

     public static void ex09() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o valor da resistencia:");
        double resistencia = scanner.nextDouble();
    
        System.out.println("Digite o valor da corrente eletrica:");
        double corrente = scanner.nextDouble();
    
        double tensao = resistencia * corrente;
    
        System.out.println("A tensão é: " + tensao);
    }
    
}
