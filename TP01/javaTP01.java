package TP01;
//Trabalho TP1 - Exercícios de 1 a 18

//Alunos:

//Nome: Jackson de Lima Gregório CB3013189
//Nome: Bruno Souza Da Costa CB3025411
import java.util.Scanner;

import TP01.exercicios.*;

public class javaTP01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
    
        do {
            System.out.println("Digite o número do exercício que deseja executar:");
            opcao = scanner.nextInt();

            switch (opcao) {
            case 1:
            TP01Ex01.ex01();
                break;
            case 2:
            TP01Ex02.ex02();
                break;
            case 3:
            TP01Ex03.ex03();
                break;
            case 4:
            TP01Ex04.ex04();
                break;
            case 5:
            TP01Ex05.ex05();
                break;
            case 6:
            TP01Ex06.ex06();
                break;
            case 7:
            TP01Ex07.ex07();
                break;
            case 8:
            TP01Ex08.ex08();
                break;
            case 9:
            TP01Ex09.ex09();
                break;
            case 10:
            TP01Ex10.ex10();
                break;
            case 11:
            TP01Ex11.ex11();
                break;
            case 12:
            TP01Ex12.ex12();
                break;
            case 13:
            TP01Ex13.ex13();
                break;
            case 14:
            TP01Ex14.ex14();
                break;
            case 15:
            TP01Ex15.ex15();
                break;
            case 16:
            TP01Ex16.ex16();
                break;
            case 17:
            TP01Ex17.ex17();
                break;
            case 18:
            TP01Ex18.ex18();
                break;
            default:
                System.out.println("Exercício não encontrado.");
                break;
            }
        } while (opcao >= 1 && opcao <= 18);
    }
       
}