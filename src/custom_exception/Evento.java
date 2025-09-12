package custom_exception;

public class Evento {
    private int qtdIngressosDisponivel;
    private int limiteMaximo = 10;

    public void comprarIngresso(int qtdComprados) {
        if (qtdComprados > qtdIngressosDisponivel) {
            throw new IngressoIndisponivelException("Quantidade de ingressos indisponível!");
        } else if (qtdComprados > 10) {
            throw new LimiteCompraExcedidoException("Limite máximo de compra: " + limiteMaximo + " ingressos.");
        } else {
            qtdIngressosDisponivel -= qtdComprados;
            System.out.println("Compra realizada com sucesso!");
        }
    }

    public Evento(int qtdIngressosDisponivel) {
        this.qtdIngressosDisponivel = qtdIngressosDisponivel;
    }

    public int getQtdDisponivel() {
        return qtdIngressosDisponivel;
    }

    public void setQtdDisponivel(int qtdIngressosDisponivel) {
        this.qtdIngressosDisponivel = qtdIngressosDisponivel;
    }

    public int getLimiteMaximo() {
        return limiteMaximo;
    }

    public void setLimiteMaximo(int limiteMaximo) {
        this.limiteMaximo = limiteMaximo;
    }
}
