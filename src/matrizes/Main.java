package matrizes;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String [] alunos = {"João", "Maria", "José"};
        float[][] notas = new float[3][4];
        float somaNotas, mediaAluno;
        String statusAluno;

        for (int i = 0; i < 3; i++) {
            System.out.println("Aluno: " + alunos[i]);
            somaNotas = 0;
            mediaAluno = 0;

            for (int j = 0; j < 4; j++) {
                notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Informe a " + (j + 1) + "a de " + alunos[i]));
                somaNotas = somaNotas + notas[i][j];
            }

            mediaAluno = somaNotas / 4;

            if (mediaAluno < 5.5) {
                statusAluno = "REPROVADO";
            } else if (mediaAluno >= 5.5 && mediaAluno <= 7.0) {
                statusAluno = "RECUPERAÇÃO";
            } else {
                statusAluno = "APROVADO";
            }

            System.out.println("********** BOLETIM **********");
            System.out.println("Aluno.: " + alunos[i]);
            System.out.println("Notas");
            for (int j1 = 0; j1 < 4; j1++) {
                System.out.println((j1 + 1) + " - " + notas[i][j1]);
            }
            System.out.println("Media: " + mediaAluno + " - " + statusAluno);
        }
    }
}
