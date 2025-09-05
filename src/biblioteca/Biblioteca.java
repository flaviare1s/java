package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<Livro>();

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void listarLivros() {
        if (this.livros.isEmpty()) {
            System.out.println("Não há livros na biblioteca");
        } else {
            for (Livro livro : this.livros) {
                livro.exibirInfoLivro();
            }
        }
    }

    public void alterarDisponibilidade(String titulo, boolean disponobilidade) {
        for (Livro livro : this.livros) {
            if (livro.getTitulo().equals(titulo)) {
                livro.setDisponibilidade(disponobilidade);
                System.out.println("Disponibilidade do livro: " + livro.getTitulo() + " foi alterada para " + ((disponobilidade) ? "disponível" : "emprestado"));
            }
        }
        System.out.println("Livro não encontrado!");
    }
}
