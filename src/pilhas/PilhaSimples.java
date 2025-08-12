package pilhas;

import java.util.Stack;

public class PilhaSimples {

    public static void main(String[] args) {
        simularPilha();
    }

    public static void simularPilha() {
        Stack<Integer> pilha = new Stack<>();
        int capacidadeMaxima = 3;

        // Empilhe: 5, 8, 4, 7 (nesta ordem)
        System.out.println("Empilhando elementos...");
        empilhar(pilha, 5, capacidadeMaxima);
        empilhar(pilha, 8, capacidadeMaxima);
        empilhar(pilha, 4, capacidadeMaxima);
        empilhar(pilha, 7, capacidadeMaxima);

        System.out.println("\nEstado atual da pilha: " + pilha);

        // Desempilhe duas vezes
        System.out.println("\nDesempilhando duas vezes...");
        desempilhar(pilha);
        desempilhar(pilha);

        System.out.println("\nEstado atual da pilha: " + pilha);

        // Consulte o topo
        System.out.println("\nConsultando o topo da pilha...");
        consultarTopo(pilha);

        System.out.println("\nEstado atual da pilha: " + pilha);

        // Desempilhe mais duas vezes
        System.out.println("\nDesempilhando mais duas vezes...");
        desempilhar(pilha);
        desempilhar(pilha);

        System.out.println("\nEstado final da pilha: " + pilha);
    }

    public static void empilhar(Stack<Integer> pilha, int valor, int capacidadeMaxima) {
        if (pilha.size() < capacidadeMaxima) {
            pilha.push(valor);
            System.out.println("Elemento " + valor + " empilhado.");
        } else {
            System.out.println("Pilha cheia! Não foi possível empilhar " + valor + ".");
        }
    }

    public static void desempilhar(Stack<Integer> pilha) {
        if (!pilha.empty()) {
            int valor = pilha.pop();
            System.out.println("Elemento " + valor + " desempilhado.");
        } else {
            System.out.println("Pilha vazia!");
        }
    }

    public static void consultarTopo(Stack<Integer> pilha) {
        if (!pilha.empty()) {
            System.out.println("O elemento no topo da pilha é: " + pilha.peek());
        } else {
            System.out.println("Pilha vazia!");
        }
    }
}
