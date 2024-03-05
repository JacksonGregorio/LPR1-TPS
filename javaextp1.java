//Trabalho TP1 - Exercícios de 1 a 18

//Alunos:

//Nome: Jackson de Lima Gregório CB3013189
//Nome: Bruno Souza Da Costa CB3025411
import java.util.Scanner;
import exercicios.*;

public class javaextp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
    
        do {
            System.out.println("Digite o número do exercício que deseja executar:");
            opcao = scanner.nextInt();
    
            switch (opcao) {
            case 1:
            Ex01.ex01();
                break;
            case 2:
            Ex02.ex02();
                break;
            case 3:
            Ex03.ex03();
                break;
            case 4:
            Ex04.ex04();
                break;
            case 5:
            Ex05.ex05();
                break;
            case 6:
            Ex06.ex06();
                break;
            case 7:
            Ex07.ex07();
                break;
            case 8:
            Ex08.ex08();
                break;
            case 9:
            Ex09.ex09();
                break;
            case 10:
            Ex10.ex10();
                break;
            case 11:
            Ex11.ex11();
                break;
            case 12:
            Ex12.ex12();
                break;
            case 13:
            Ex13.ex13();
                break;
            case 14:
            Ex14.ex14();
                break;
            case 15:
            Ex15.ex15();
                break;
            case 16:
            Ex16.ex16();
                break;
            case 17:
            Ex17.ex17();
                break;
            case 18:
            Ex18.ex18();
                break;
            default:
                System.out.println("Exercício não encontrado.");
                break;
            }
        } while (opcao >= 1 && opcao <= 18);
    }
       
}