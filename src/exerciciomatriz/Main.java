package exerciciomatriz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizSoma = new int[2][2];
        int soma = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Digite um número inteiro para a posição [" + i + "][" + j + "]: ");

                matrizSoma[i][j] = scanner.nextInt();

                soma = soma + matrizSoma[i][j];
            }
        }

        System.out.println("A soma de todos os elementos da matriz é: " + soma);

        scanner.close();
    }
}
