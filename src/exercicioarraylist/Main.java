package exercicioarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite números inteiros (digite 0 para encerrar): ");

        int numero;

        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();
            if (numero != 0) {
                listaNumeros.add(numero);
            }
        } while (numero != 0);

        System.out.println("Números armazenados: ");
        for (int n : listaNumeros) {
            System.out.println(n);
        }

        int soma = 0;

        for (int n : listaNumeros) {
            soma += n;
        }

        System.out.println("Números armazenados: " + soma);
    }
}
