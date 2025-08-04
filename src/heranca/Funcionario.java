package heranca;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTravalhando() {
        return trabalhando;
    }

    public void setTravalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho() {
        this.trabalhando = !this.trabalhando;
    }
}
