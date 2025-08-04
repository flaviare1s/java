package heranca2;

public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();

        v1.setNome("José");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Maria");
        a1.setMatricula(1);
        a1.setIdade(18);
        a1.fazerAniversario();
        System.out.println(a1.toString());
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Ana");
        b1.setMatricula(2);
        b1.setBolsa(12.5f);
        b1.setIdade(18);
        b1.pagarMensalidade();
        System.out.println(b1.toString());
        b1.pagarMensalidade();
    }
}
