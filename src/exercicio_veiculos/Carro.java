package exercicio_veiculos;

public class Carro extends Veiculo {
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public String tipoDeVeiculo() {
        return "Carro";
    }
}
