import java.util.Scanner;
import exercicios.*;

//jackson de lima gregorio CB:3013189
//Bruno sousa da costa CB:3025411

public class javaTP02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
    
        do {
            System.out.println("Digite o número do exercício que deseja executar:");
            opcao = scanner.nextInt();
    
            switch (opcao) {
            case 1:
                TP02Ex01.ex01();
                break;
            case 2:
                TP02Ex02.ex02();
                break;
            case 3:
                TP02Ex03.ex03();
                break;
            case 4:
                TP02Ex04.ex04();
                break;
            case 5:
                TP02Ex05.ex05();
                break;
            case 6:
                TP02Ex06.ex06();
                break;
            case 7:
                TP02Ex07.ex07();
                break;
            case 8:
                TP02Ex08.ex08();
                break;
            case 9:
                TP02Ex09.ex09();
                break;
            case 10:
                TP02Ex10.ex10();
                break;
            case 11:
                TP02Ex11.ex11();
                break;
            default:
                System.out.println("Exercício não encontrado.");
                break;
            }
        } while (opcao >= 1 && opcao <= 11);
    }
    
}
