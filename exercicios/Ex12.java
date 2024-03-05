package exercicios;

import java.util.Scanner;

public class Ex12 {

    public static void ex12() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite a altura do cone:");
        double altura = scanner.nextDouble();
    
        System.out.println("Digite o raio da base do cone:");
        double raio = scanner.nextDouble();
    
        double volume = (1/3) * Math.PI * Math.pow(raio, 2) * altura;
    
        System.out.println("O volume do cone é: " + volume);
    }

    
}
