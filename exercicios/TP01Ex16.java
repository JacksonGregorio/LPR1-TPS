package exercicios;

import java.util.Scanner;

public class TP01Ex16 {

     public static void ex16() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("digite o valor de um angulo em graus:");
        double anguloGraus = scanner.nextDouble();
    
        double anguloRadianos = Math.toRadians(anguloGraus);
        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);
        double secante = 1 / cosseno;
    
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Secante: " + secante);
    }
    
}
