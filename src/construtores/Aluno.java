package construtores;

public class Aluno {
    public double nota1, nota2, nota3;
    STATUS situacaoAluno;
    MATRICULA situacaoMatricula;

    public Aluno(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public enum MATRICULA {
        MATRICULADO,
        PENDENTE,
        RECUSADO
    }

    public enum STATUS {
        APROVADO,
        REPROVADO
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }
}