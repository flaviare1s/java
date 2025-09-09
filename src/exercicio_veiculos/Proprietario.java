package exercicio_veiculos;

import java.util.ArrayList;
import java.util.List;

public class Proprietario {
    private String nome;
    private String endereco;
    List<Veiculo> veiculos = new ArrayList<>();

    public Proprietario(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void listarVeiculos() {
        System.out.println("Veículos de " + nome + ":");

        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
            return; // sai do método
        }

        for (Veiculo veiculo : veiculos) {
            System.out.println(
                    veiculo.tipoDeVeiculo() + " - " +
                            veiculo.getMarca() + " " +
                            veiculo.getModelo() + " (" +
                            veiculo.getAno() + ")"
            );
        }
    }
}
