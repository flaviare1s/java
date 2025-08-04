package heranca;

public class Professor extends Pessoa {
    private String epecialidade;
    private double salario;

    public String getEpecialidade() {
        return epecialidade;
    }

    public void setEpecialidade(String epecialidade) {
        this.epecialidade = epecialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void receberAumento(double aumento) {
        this.salario += aumento;
    }
}
