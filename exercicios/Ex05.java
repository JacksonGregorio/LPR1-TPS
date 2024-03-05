package exercicios;

import java.util.Scanner;

public class Ex05 {

    public static void ex05() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o valor do diâmetro da esfera:");
        double diametro = scanner.nextDouble();
    
        double raio = diametro / 2;
        double volume = (4/3) * Math.PI * Math.pow(raio, 3);
    
        System.out.println("O volume da esfera é: " + volume);
    }
    
}
