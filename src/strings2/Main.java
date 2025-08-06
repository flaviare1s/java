package strings2;

public class Main {
    public static void main(String[] args) {

        // Criação de Strings
        String nome = "Oswaldo";                  // String literal (usa o pool de strings)
        String nomeGuerra = "Oswaldo";            // Também é literal — aponta para o mesmo objeto que 'nome'
        String sobrenome = new String("Oswaldo"); // Cria um NOVO objeto na memória (mesmo conteúdo)

        // Comparação usando ==
        // Compara se as variáveis apontam para o MESMO endereço de memória (referência)
        if (nome == nomeGuerra) {
            System.out.println("nome == nomeGuerra → Nomes iguais (mesmo objeto)");
        } else {
            System.out.println("nome == nomeGuerra → Nomes diferentes");
        }

        if (nome == sobrenome) {
            System.out.println("nome == sobrenome → Nomes iguais (mesmo objeto)");
        } else {
            System.out.println("nome == sobrenome → Nomes diferentes (objetos diferentes)");
        }

        // Comparação usando equals()
        // Compara o CONTEÚDO (valores dos caracteres)
        if (nome.equals(nomeGuerra)) {
            System.out.println("nome.equals(nomeGuerra) → Nomes iguais (mesmo conteúdo)");
        } else {
            System.out.println("nome.equals(nomeGuerra) → Nomes diferentes");
        }

        if (nome.equals(sobrenome)) {
            System.out.println("nome.equals(sobrenome) → Nomes iguais (mesmo conteúdo)");
        } else {
            System.out.println("nome.equals(sobrenome) → Nomes diferentes");
        }

        // Concatenando as Strings
        System.out.println("Concatenação: " + nome + " " + sobrenome);

        // Mostrando o tamanho da String nome
        System.out.println("Tamanho de 'nome': " + nome.length());
    }
}
