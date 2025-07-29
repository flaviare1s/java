package arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] num = {1, 3, 4, 6, 9, 22, 4};

        Arrays.sort(num); // Ordenando o array
        
        int posicao = Arrays.binarySearch(num, 22);
        System.out.println("O valor está na posição " + posicao);

        for (int n: num) {
            System.out.println(n);
        }


        int[] numeros = new int[20];

        Arrays.fill(numeros, 0); // Preenche todas as posições

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
