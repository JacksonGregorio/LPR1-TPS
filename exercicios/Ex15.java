package exercicios;

import java.util.Scanner;

public class Ex15 {

       public static void ex15() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite a cotação do dólar:");
        double cotacao = scanner.nextDouble();
    
        System.out.println("Digite a quantidade de dólares:");
        double dolares = scanner.nextDouble();
    
        double reais = cotacao * dolares;
    
        System.out.println("O valor em reais é: R$" + reais);
    }
    
}
