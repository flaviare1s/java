package strings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String professor, matricula, aluno, situacao, turma;
        double teste, prova, media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do professor: ");
        professor = scanner.nextLine();

        System.out.println("Professor " + professor);

        System.out.println("Digite a turma: ");
        turma = scanner.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do aluno: ");
            aluno = scanner.nextLine();

            System.out.println("Digite a matrícula do aluno: ");
            matricula = scanner.nextLine();

            System.out.println("Digite a nota do teste: ");
            teste = scanner.nextDouble();

            System.out.println("Digite a nota da prova: ");
            prova = scanner.nextDouble();

            media = (teste + prova) / 2;

            System.out.printf("O aluno %s, de matricula %s, tirou média %s. \n", aluno, matricula, media);
        }
    }
}
