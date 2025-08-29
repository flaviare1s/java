package construtores;

public class Construtor {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(8, 8, 8);

        double media = aluno1.calcularMedia();

        if (media < 6) {
            aluno1.situacaoAluno = Aluno.STATUS.REPROVADO;
        } else {
            aluno1.situacaoAluno = Aluno.STATUS.APROVADO;
        }

        System.out.println("A média é " + media + " e o aluno está " + aluno1.situacaoAluno);

        // Usando enum MATRICULA
        aluno1.situacaoMatricula = Aluno.MATRICULA.MATRICULADO;

        System.out.println(aluno1.situacaoMatricula);
    }
}
