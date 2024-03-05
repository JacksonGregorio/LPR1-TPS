package exercicios;

import java.util.Scanner;

public class Ex06 {

    public static void ex06() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o primeiro valor:");
        double valor1 = scanner.nextDouble();
    
        System.out.println("Digite o segundo valor:");
        double valor2 = scanner.nextDouble();
    
        System.out.println("Digite o terceiro valor:");
        double valor3 = scanner.nextDouble();
    
        System.out.println("Digite o quarto valor:");
        double valor4 = scanner.nextDouble();
    
        double media = (valor1 + valor2 + valor3 + valor4) / 4;
    
        System.out.println("A média aritmética é: " + media);
    }
    
}
