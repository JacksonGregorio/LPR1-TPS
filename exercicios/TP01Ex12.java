package exercicios;

import java.util.Scanner;
import java.lang.Math;

public class TP01Ex12 {

    public static void ex12() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite a altura do cone:");
        double altura = scanner.nextDouble();
    
        System.out.println("Digite o raio da Base do cone:");
        double raio = scanner.nextDouble();
    
        double volume = (Math.PI * raio * raio * altura) / 3;
    
        System.out.println("O volume do cone é: " + volume);
    }

    
}
