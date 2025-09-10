package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new LinkedList<>();

        funcionarios.add(new Funcionario("Maria Silva", 3500.0, "Analista", 28));
        funcionarios.add(new Funcionario("João Souza", 4200.0, "Desenvolvedor", 32));
        funcionarios.add(new Funcionario("Ana Costa", 2800.0, "Assistente", 24));
        funcionarios.add(new Funcionario("Carlos Pereira", 5100.0, "Gerente", 40));
        funcionarios.add(new Funcionario("Fernanda Lima", 3900.0, "Designer", 29));
        funcionarios.add(new Funcionario("Ricardo Gomes", 6000.0, "Arquiteto de Software", 45));
        funcionarios.add(new Funcionario("Beatriz Rocha", 4500.0, "Coordenadora", 35));
        funcionarios.add(new Funcionario("Pedro Alves", 3100.0, "Suporte Técnico", 27));
        funcionarios.add(new Funcionario("Juliana Martins", 7000.0, "Diretora", 50));
        funcionarios.add(new Funcionario("Felipe Santos", 2500.0, "Estagiário", 21));

        funcionarios.stream().filter(funcionario -> funcionario.getIdade() > 30)
                .forEach(funcionario -> System.out.println(funcionario.getNome() + " - " + funcionario.getCargo()));

        funcionarios.stream().sorted(Comparator.comparing(Funcionario::getSalario))
                .forEach(funcionario -> System.out.println(funcionario.getNome() + " - " + funcionario.getSalario()));

        double media = funcionarios.stream().mapToDouble(Funcionario::getSalario).average().orElse(0.0);
        System.out.println("Média: " + media);

        long ricos = funcionarios.stream().filter(funcionario -> funcionario.getSalario() > 4000.0).count();
        System.out.println("Número de ricos: " + ricos);

        List<String> nomes = funcionarios.stream()
                .map(Funcionario::getNome)
                .toList();
        System.out.println("Lista de nomes: " + nomes);
    }
}
