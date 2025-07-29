package dowhile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;

        do {
            System.out.println(i);
            i++;
        } while (i < 4);


        int n, soma = 0;
        String resposta;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite um número: ");
            n = scanner.nextInt();
            soma += n;

            System.out.println("Quer continuar?");
            resposta = scanner.next();
        } while (resposta.equalsIgnoreCase("s"));
        System.out.println("A soma de todos os valores é: " + soma);
    }
}
