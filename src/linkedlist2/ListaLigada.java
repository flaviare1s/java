package linkedlist2;

public class ListaLigada {

    static class No {
        int valor;
        No proximo;

        No(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    static No inicio = null;

    public static void main(String[] args) {
        simularLista();
    }

    public static void simularLista() {
        System.out.println("--- Inserindo elementos ---");
        // Inserir: 43 no início
        inserirInicio(43);
        // Inserir: 89 no final
        inserirFinal(89);
        // Inserir: 55 na posição 2
        inserirEm(55, 2);
        mostrarLista();

        System.out.println("\n--- Consultando elementos ---");
        // Consultar início e fim
        consultarInicio();
        consultarFinal();

        System.out.println("\n--- Removendo elementos ---");
        // Remover os valores: 55, 43, 7, 89 (nesta ordem)
        remover(55);
        remover(43);
        remover(7);
        remover(89);
        mostrarLista();
    }


    public static void inserirInicio(int valor) {
        No novoNo = new No(valor);
        novoNo.proximo = inicio;
        inicio = novoNo;
        System.out.println("Inserido " + valor + " no início da lista.");
    }

    public static void inserirFinal(int valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = novoNo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
        System.out.println("Inserido " + valor + " no final da lista.");
    }

    public static void inserirEm(int valor, int posicao) {
        if (posicao < 1) {
            System.out.println("Posição inválida.");
            return;
        }
        if (posicao == 1) {
            inserirInicio(valor);
            return;
        }

        No novoNo = new No(valor);
        No atual = inicio;
        int contador = 1;
        while (atual != null && contador < posicao - 1) {
            atual = atual.proximo;
            contador++;
        }

        if (atual == null) {
            System.out.println("Posição " + posicao + " fora dos limites da lista.");
        } else {
            novoNo.proximo = atual.proximo;
            atual.proximo = novoNo;
            System.out.println("Inserido " + valor + " na posição " + posicao + ".");
        }
    }

    public static void remover(int valor) {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }

        if (inicio.valor == valor) {
            inicio = inicio.proximo;
            System.out.println("Removido o elemento " + valor + ".");
            return;
        }

        No atual = inicio;
        while (atual.proximo != null && atual.proximo.valor != valor) {
            atual = atual.proximo;
        }

        if (atual.proximo == null) {
            System.out.println("Elemento não existe na lista ligada.");
        } else {
            atual.proximo = atual.proximo.proximo;
            System.out.println("Removido o elemento " + valor + ".");
        }
    }

    public static void consultarInicio() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
        } else {
            System.out.println("Elemento no início: " + inicio.valor);
        }
    }

    public static void consultarFinal() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }
        No atual = inicio;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }
        System.out.println("Elemento no fim: " + atual.valor);
    }

    public static void mostrarLista() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }
        System.out.print("Lista: ");
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }
}
