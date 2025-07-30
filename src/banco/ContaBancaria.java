package banco;

import java.util.Objects;

public class ContaBancaria {
    public int numConta;
    protected String tipo;
    public static final String CONTA_CORRENTE = "CC";
    public static final String CONTA_POUPANCA = "CP";
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBancaria() {
        setSaldo(0);
        setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void abrirConta(String tipo) {
        setTipo(tipo);
        setStatus(true);

        if (tipo.equals(CONTA_CORRENTE)) {
            setSaldo(50);
        } else {
            setSaldo(150);
        }
    }

    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Conta com dinheiro!");
        } else if (saldo < 0) {
            System.out.println("Conta em débito");
        } else {
            setStatus(false);
            System.out.println("Conta fechada!");
        }
    }

    public void depositar(double valor) {
        if (isStatus()) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Impossível depositar!");
        }
    }

    public void sacar(double valor) {
        if (isStatus()) {
            if (saldo >= valor) {
                setSaldo(getSaldo() - valor);
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossível sacar!");
        }
    }

    public void pagarMensalidade() {
        float valor = 0;

        if (tipo.equalsIgnoreCase(CONTA_CORRENTE)) {
            valor = 12;
            System.out.println("Mensalidade no valor de R$" + valor + " Paga com sucesso.");
        } else if (tipo.equalsIgnoreCase(CONTA_POUPANCA)) {
            valor = 20;
            System.out.println("Mensalidade no valor de R$" + valor + " Paga com sucesso.");
        }

        if (isStatus()) {
            if (saldo >= valor) {
                setSaldo(getSaldo() - valor);
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Impossível pagar!");
        }
    }
}
