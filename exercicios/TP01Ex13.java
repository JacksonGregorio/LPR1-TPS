package exercicios;

import java.util.Scanner;

public class TP01Ex13 {

       public static void ex13() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite a velocidade inicial (em m/s):");
        double velocidadeInicial = scanner.nextDouble();
    
        System.out.println("Digite a aceleração (em m/s^2):");
        double aceleracao = scanner.nextDouble();
    
        System.out.println("Digite o tempo de percurso (em s):");
        double tempo = scanner.nextDouble();
    
        double velocidadeFinal = (velocidadeInicial + aceleracao * tempo) * 3.6;
    
        System.out.println("A velocidade final é: " + velocidadeFinal + " km/h");
    }
    
}
