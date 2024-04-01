package exercicios;
import java.util.Scanner;
public class TP02Ex01 {

    //1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
    //Caso contrário solicitar novamente apenas o segundo valor.

    public static void ex01() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        double valor1 = scanner.nextDouble();

        double valor2;
        do {
            System.out.println("Digite o segundo valor (deve ser maior que o primeiro):");
            valor2 = scanner.nextDouble();
        } while (valor2 <= valor1);
    }
    
}
