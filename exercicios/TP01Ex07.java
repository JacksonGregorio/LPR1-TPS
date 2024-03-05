package exercicios;

import java.util.Scanner;

public class TP01Ex07 {

    public static void ex07() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o primeiro valor:");
        double valor1 = scanner.nextDouble();
    
        System.out.println("Digite o segundo valor:");
        double valor2 = scanner.nextDouble();
    
        double mediaGeometrica = Math.sqrt(valor1 * valor2);
    
        System.out.println("A média geométrica é: " + mediaGeometrica);
    }
    
}
