package exercicio_veiculos;

import java.util.ArrayList;
import java.util.List;

public class Oficina {
    private String nome;
    private List<Servico> servicos;

    public Oficina(String nome) {
        this.nome = nome;
        this.servicos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }

    public void listarServicos() {
        System.out.println("Serviços realizados pela oficina " + getNome() + ":");
        for (Servico s : servicos) {
            System.out.println("- " + s.getDescricao() + " | Preço: " + s.getPreco());
        }
    }
}
