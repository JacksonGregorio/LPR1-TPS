package exercicios;

import java.util.Scanner;

public class Ex14 {

    public static void ex14() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o raio da esfera:");
        double raio = scanner.nextDouble();
    
        System.out.println("Digite a aresta do cubo:");
        double aresta = scanner.nextDouble();
    
        double volumeEsfera = (4/3) * Math.PI * Math.pow(raio, 3);
        double volumeCubo = Math.pow(aresta, 3);
        double volumeLivre = volumeCubo - volumeEsfera;
    
        System.out.println("O volume livre no ambiente é: " + volumeLivre);
    }
    
}
