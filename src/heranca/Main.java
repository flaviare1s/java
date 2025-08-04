package heranca;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("José");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");

        p1.setSexo("M");
        p1.setIdade(22);
        p1.fazerAniversario();

        p3.setSalario(2500.0);
        p3.receberAumento(500.5);

        System.out.println(p1.toString());
        System.out.println(p3.getSalario());
    }
}
