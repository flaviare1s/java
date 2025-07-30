package poo1;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    public Caneta(String modelo, String cor, int carga, float ponta) {
        setModelo(modelo);
        setCor(cor);
        setCarga(carga);
        setPonta(ponta);
        tampar();
    }

    public void status() {
        System.out.println("Uma caneta de cor " + this.getCor());
        System.out.println("Uma caneta do modelo " + this.getModelo());
        System.out.println("Uma caneta com carga " + this.getCarga());
        System.out.println("Uma caneta com ponta " + this.getPonta());
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada) {
            System.out.println("Não pode rabiscar");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
}
