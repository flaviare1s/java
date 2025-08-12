package arvoresbinarias;

public class TesteArvore {
    public static void main(String[] args) {
        simularArvore();
    }

    public static void simularArvore() {
        ArvoreBinaria arvore = new ArvoreBinaria();

        System.out.println("--- Inserindo nós ---");
        arvore.inserirNo(15);
        arvore.inserirNo(6);
        arvore.inserirNo(23);
        arvore.inserirNo(4);
        arvore.inserirNo(7);
        arvore.inserirNo(71);
        arvore.inserirNo(5);

        System.out.println("\n--- Árvore em ordem (antes da exclusão) ---");
        arvore.exibirEmOrdem();

        System.out.println("\n--- Excluindo o nó com valor 6 ---");
        arvore.excluirNo(6);

        System.out.println("\n--- Árvore em ordem (após a exclusão) ---");
        arvore.exibirEmOrdem();
    }
}