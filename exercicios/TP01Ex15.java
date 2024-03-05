package exercicios;

import java.util.Scanner;

public class TP01Ex15 {

       public static void ex15() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("digite a cotação do dolar:");
        double cotacao = scanner.nextDouble();
    
        System.out.println("Digite a quantidade de dolares:");
        double dolares = scanner.nextDouble();
    
        double reais = cotacao * dolares;
    
        System.out.println("O valor em Reais é: R$" + reais);
    }
    
}
