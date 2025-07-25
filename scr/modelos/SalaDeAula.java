package scr.modelos;
public class SalaDeAula extends Espaco {
    private boolean possuiProjetor;

    public SalaDeAula(int id, String nome, String localizacao, int capacidade, boolean possuiProjetor) {
        super(id, nome, localizacao, capacidade);
        this.possuiProjetor = possuiProjetor;
    }

    public boolean temProjetor() {
        return possuiProjetor;
    }

    public void setProjetor(boolean possuiProjetor) {
        this.possuiProjetor = possuiProjetor;
    }

    @Override
    public String toString() {
        return super.toString() + " | Sala de Aula | Projetor: " + (possuiProjetor ? "Sim" : "Não");
    }
}

