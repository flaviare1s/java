package encapsulamentoeinterfaces;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println(isLigado());
        System.out.println(getVolume());

        for (int i = 0; i <= getVolume(); i += 10) {
            System.out.print("|");
        }

        System.out.println(isTocando());
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (isLigado()) {
            setVolume(getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if (isLigado()) {
            setVolume(getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if (isLigado() && getVolume() > 0) {
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (isLigado() && getVolume() == 0) {
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if (isLigado() && !isTocando()) {
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (isLigado() && isTocando()) {
            setTocando(false);
        }
    }
}
