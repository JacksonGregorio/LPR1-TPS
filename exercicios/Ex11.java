package exercicios;

import java.util.Scanner;

public class Ex11 {

    public static void ex11() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o diâmetro do círculo:");
        double diametro = scanner.nextDouble();
    
        double raio = diametro / 2;
        double area = Math.PI * Math.pow(raio, 2);
    
        System.out.println("A área do círculo é: " + area);
    }
    
}
