package stringbuffer;

public class Main {
    public static void main(String[] args) {
        String nome = "Oswaldo";
        String sobrenome = "Borges";
        String nomeCompleto = nome + sobrenome;
        String nomeComBuffer;

        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append(nome);
        stringBuffer.append(sobrenome);

        nomeComBuffer = stringBuffer.toString();

        System.out.println(nomeCompleto);
        System.out.println(nomeComBuffer);
    }
}
