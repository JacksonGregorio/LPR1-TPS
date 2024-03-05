package exercicios;

import java.util.Scanner;

public class TP01Ex18 {
    
    public static void ex18() {
        Scanner scanner = new Scanner(System.in);
    
        double total = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o valor do produto " + i + ":");
            total += scanner.nextDouble();
        }
    
        System.out.println("Digite o valor pago:");
        double pago = scanner.nextDouble();
    
        double troco = pago - total;
    
        System.out.println("O troco é: R$" + troco);
    }
}
