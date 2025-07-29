package estruturascondicionais;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float nota1;
        float nota2;
        float media;

        System.out.println("Digite a primeira nota: ");
        nota1 = scanner.nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota2 = scanner.nextFloat();

        media = (nota1 + nota2) / 2;

        if (media >= 9 && media <= 10) {
            System.out.println("Parabéns, você você aprovado com nota muito boa!");
        } else if (media < 9 && media >= 7) {
            System.out.println("Você foi aprovado!");
        } else if (media < 7 && media >= 6) {
            System.out.println("Recuperação!");
        } else if (media < 6 && media >= 0) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Nota inválida!-");
        }

        // Switch case
        int quantidadePernas;
        System.out.println("Qual a quantidade de pernas?");
        quantidadePernas= scanner.nextInt();
        String tipo;

        switch (quantidadePernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6,8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }

        System.out.println(tipo);
    }
}
