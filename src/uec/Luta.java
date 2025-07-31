package uec;

import java.util.Objects;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta() {

    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)) {
            this.setAprovada(true);
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.isAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            int resultado = (int) (Math.random() * 3);

            switch (resultado) {
                case 0 -> {
                    System.out.println("A luta terminou em empate!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                }
                case 1 -> {
                    System.out.println("A vitória é de " + desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                }
                case 2 -> {
                    System.out.println("A vitória é de " + desafiante.getNome());
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                }
            }
        } else {
            System.out.println("Luta não aprovada!");
        }
    }
}
