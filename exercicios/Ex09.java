package exercicios;

import java.util.Scanner;

public class Ex09 {

     public static void ex09() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o valor da resistência:");
        double resistencia = scanner.nextDouble();
    
        System.out.println("Digite o valor da corrente elétrica:");
        double corrente = scanner.nextDouble();
    
        double tensao = resistencia * corrente;
    
        System.out.println("A tensão é: " + tensao);
    }
    
}
