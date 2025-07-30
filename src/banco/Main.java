package banco;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.abrirConta("CP");
        conta1.setNumConta(1);
        conta1.setDono("Creuza");
        conta1.depositar(500);
        conta1.pagarMensalidade();
        System.out.println(conta1.getSaldo());

        System.out.println("================");

        ContaBancaria conta2 = new ContaBancaria();
        conta2.abrirConta("CC");
        conta2.setNumConta(2);
        conta2.setDono("Jubileu");
        conta2.sacar(30);
        System.out.println(conta2.getSaldo());
    }
}
