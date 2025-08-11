package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo (ex: teste.md):");
        String nomeArquivo = scanner.nextLine();

        ClassLoader classLoader = Main.class.getClassLoader();
        URL resource = classLoader.getResource("arquivos/" + nomeArquivo);
        File objFile = null;

        if (resource != null) {
            objFile = new File(resource.getFile());
        }

        // Se o arquivo não existir, cria um novo objeto File para o caminho
        if (objFile == null || !objFile.exists()) {
            System.out.println("Arquivo inexistente. Criando um novo arquivo.");
            // Define o caminho para a pasta src/arquivos
            String path = "src/arquivos/" + nomeArquivo;
            objFile = new File(path);
            try {
                objFile.createNewFile();
            } catch (IOException e) {
                System.out.println("Erro ao criar o arquivo: " + e.getMessage());
                scanner.close();
                return;
            }
        }

        System.out.println("\nArquivo encontrado ou criado: " + objFile.getAbsolutePath());

        // Menu de operações
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Ler o arquivo");
            System.out.println("2. Escrever no arquivo (substitui o conteúdo)");
            System.out.println("3. Adicionar ao arquivo (mantém o conteúdo existente)");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            String opcao = scanner.nextLine();

            try {
                switch (opcao) {
                    case "1":
                        lerArquivo(objFile);
                        break;
                    case "2":
                        escreverArquivo(scanner, objFile, false);
                        break;
                    case "3":
                        escreverArquivo(scanner, objFile, true);
                        break;
                    case "4":
                        System.out.println("Saindo...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (IOException e) {
                System.out.println("Erro de E/S: " + e.getMessage());
            }
        }
    }

    private static void lerArquivo(File file) throws IOException {
        System.out.println("--- Conteúdo do Arquivo ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        System.out.println("--------------------------");
    }

    private static void escreverArquivo(Scanner scanner, File file, boolean append) throws IOException {
        String modo = append ? "adicionando" : "substituindo";
        System.out.println("Digite o texto para " + modo + " no arquivo (digite 'SAIR' em uma nova linha para finalizar):");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, append))) {
            String line;
            while (true) {
                line = scanner.nextLine();
                if (line.equalsIgnoreCase("SAIR")) {
                    break;
                }
                writer.write(line);
                writer.newLine(); // Adiciona uma nova linha
            }
            System.out.println("Conteúdo gravado com sucesso.");
        }
    }
}
