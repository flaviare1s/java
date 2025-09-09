package exercicio_veiculos;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Veiculo carro1 = new Carro("Fiat", "Uno", 2010);
        Veiculo carro2 = new Carro("Toyota", "Corolla", 2022);
        Veiculo carro3 = new Carro("Honda", "Civic", 2018);

        Veiculo moto1 = new Moto("Honda", "CB500F", 2021);
        Veiculo moto2 = new Moto("Yamaha", "MT-07", 2020);
        Veiculo moto3 = new Moto("Kawasaki", "Ninja 400", 2019);

        Proprietario dono1 = new Proprietario("Maria", "Rua das Alamedas, 15");
        Proprietario dono2 = new Proprietario("José", "Rua das Flores, 16");

        Servico servico1 = new Servico("Lavagem completa", new BigDecimal("200"));
        Servico servico2 = new Servico("Limpeza do motor", new BigDecimal("100"));

        Oficina oficina1 = new Oficina("Oficina Boa Demais");

        oficina1.adicionarServico(servico1);
        oficina1.adicionarServico(servico2);

        oficina1.listarServicos();

        dono1.adicionarVeiculo(moto1);
        dono1.adicionarVeiculo(moto3);

        dono1.listarVeiculos();

        dono2.listarVeiculos();

        carro1.exibirInfo();
    }
}
