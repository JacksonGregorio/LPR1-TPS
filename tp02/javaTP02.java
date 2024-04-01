import java.util.Scanner;

public class javaTP02 {

    static Scanner scanner = new Scanner(System.in);

    public static void ex01() {
        System.out.println("Digite o primeiro valor:");
        double valor1 = scanner.nextDouble();

        double valor2;
        do {
            System.out.println("Digite o segundo valor (deve ser maior que o primeiro):");
            valor2 = scanner.nextDouble();
        } while (valor2 <= valor1);
    }

    public static void ex02() {
        double[] valores = new double[10];
        double soma = 0;
        double maior = Double.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            do {
                System.out.println("Digite o valor " + (i + 1) + " (deve ser positivo):");
                valores[i] = scanner.nextDouble();
            } while (valores[i] < 0);

            soma += valores[i];
            if (valores[i] > maior) {
                maior = valores[i];
            }
        }

        double media = soma / 10;

        System.out.println("O maior valor é: " + maior);
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A média aritmética dos valores é: " + media);
    }

    public static void ex03() {
        int N;
        do {
            System.out.println("Digite a quantidade de números (deve ser positivo e menor que 20):");
            N = scanner.nextInt();
        } while (N <= 0 || N >= 20);
    
        double[] valores = new double[N];
        double soma = 0;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        int countPos = 0;
        int countNeg = 0;
    
        for (int i = 0; i < N; i++) {
            System.out.println("Digite o valor " + (i + 1) + ":");
            valores[i] = scanner.nextDouble();
    
            soma += valores[i];
            if (valores[i] > maior) {
                maior = valores[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
            }
            if (valores[i] > 0) {
                countPos++;
            } else if (valores[i] < 0) {
                countNeg++;
            }
        }
    
        double media = soma / N;
        double percPos = (double) countPos / N * 100;
        double percNeg = (double) countNeg / N * 100;
    
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A média aritmética dos valores é: " + media);
        System.out.println("A porcentagem de valores que são positivos é: " + percPos + "%");
        System.out.println("A porcentagem de valores que são negativos é: " + percNeg + "%");
    }
    
    public static void ex04() {
        double[][] matriz = new double[2][3];
    
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o valor da posição [" + i + "][" + j + "]:");
                matriz[i][j] = scanner.nextDouble();
            }
        }
    
        System.out.println("Os valores da matriz são:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void ex05() {
        double[][] matriz = new double[3][2];
    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Digite o valor da posição [" + i + "][" + j + "]:");
                matriz[i][j] = scanner.nextDouble();
            }
        }
    
        System.out.println("Os valores da matriz são:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ex06() {
        String[][] matriz = new String[2][3];
    
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o nome para a posição [" + i + "][" + j + "]:");
                matriz[i][j] = scanner.next();
            }
        }
    
        System.out.println("Os nomes na matriz são:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void ex07() {
        double[][] matriz = new double[3][4];
    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite o valor para a posição [" + i + "][" + j + "]:");
                matriz[i][j] = scanner.nextDouble();
            }
        }
    
        System.out.println("Digite a constante multiplicativa:");
        double constante = scanner.nextDouble();
    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] *= constante;
            }
        }
    
        System.out.println("Os valores da matriz após a multiplicação são:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void ex08() {
        double[][] matriz = new double[3][4];
        double[][] matrizResultante = new double[3][4];
    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite o valor para a posição [" + i + "][" + j + "]:");
                matriz[i][j] = scanner.nextDouble();
            }
        }
    
        System.out.println("Digite a constante multiplicativa:");
        double constante = scanner.nextDouble();
    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrizResultante[i][j] = matriz[i][j] * constante;
            }
        }
    
        System.out.println("Os valores da matriz original são:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    
        System.out.println("Os valores da matriz resultante após a multiplicação são:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizResultante[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ex09() {
        System.out.println("Digite a quantidade de linhas da matriz (no máximo 10):");
        int M = scanner.nextInt();
        System.out.println("Digite a quantidade de colunas da matriz (no máximo 10):");
        int N = scanner.nextInt();
    
        double[][] matriz = new double[M][N];
        double[][] matrizTransposta = new double[N][M];
    
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("Digite o valor para a posição [" + i + "][" + j + "]:");
                matriz[i][j] = scanner.nextDouble();
                matrizTransposta[j][i] = matriz[i][j];
            }
        }
    
        System.out.println("A matriz original é:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    
        System.out.println("A matriz transposta é:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void ex10() {
        System.out.println("Digite a ordem da matriz quadrada (no máximo 10):");
        int M = scanner.nextInt();
    
        double[][] matriz = new double[M][M];
        double[][] matrizInversa = new double[M][M];
    
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.println("Digite o valor para a posição [" + i + "][" + j + "]:");
                matriz[i][j] = scanner.nextDouble();
            }
        }
    
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                matrizInversa[i][j] = (i == j) ? 1 : 0;
            }
        }
    
        System.out.println("A matriz original é:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    
        System.out.println("A matriz inversa é:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matrizInversa[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ex11() {
        System.out.println("Digite a ordem da matriz quadrada (no máximo 10):");
        int M = scanner.nextInt();
    
        double[][] matriz = new double[M][M];
    
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.println("Digite o valor para a posição [" + i + "][" + j + "]:");
                matriz[i][j] = scanner.nextDouble();
            }
        }
    
        double determinante = 0;
    
        if (M == 2) {
            determinante = matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        } else if (M == 3) {
            determinante = matriz[0][0] * matriz[1][1] * matriz[2][2]
                         + matriz[0][1] * matriz[1][2] * matriz[2][0]
                         + matriz[0][2] * matriz[1][0] * matriz[2][1]
                         - matriz[0][2] * matriz[1][1] * matriz[2][0]
                         - matriz[0][1] * matriz[1][0] * matriz[2][2]
                         - matriz[0][0] * matriz[1][2] * matriz[2][1];
        } else {
            System.out.println("O cálculo do determinante para matrizes de ordem maior que 3 não foi implementado.");
            return;
        }
    
        System.out.println("O determinante da matriz é: " + determinante);
    }
    
    public static void main(String[] args) {
        ex01();
        ex02();
        ex03();
        ex04();
        ex05();
        ex06();
        ex07();
        ex08();
        ex09();
        ex10();
        ex11();
    }
    
}
