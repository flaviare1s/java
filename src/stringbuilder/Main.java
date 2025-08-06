package stringbuilder;

public class Main {
    public static void main(String[] args) {
        String nome = "Oswaldo";
        String sobrenome = "Borges";
        String nomeCompleto = nome + sobrenome;
        String nomeComBuffer;

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(nome);
        stringBuilder.append(sobrenome);

        nomeComBuffer = stringBuilder.toString();

        System.out.println(nomeCompleto);
        System.out.println(nomeComBuffer);
    }
}
