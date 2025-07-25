public class Auditorio extends Espaco {
    private boolean acusticaEspecial;

    public Auditorio(int id, String nome, String localizacao, int capacidade, boolean acusticaEspecial) {
        super(id, nome, localizacao, capacidade);
        this.acusticaEspecial = acusticaEspecial;
    }

    public boolean temAcusticaEspecial() {
        return acusticaEspecial;
    }

    public void setAcusticaEspecial(boolean acusticaEspecial) {
        this.acusticaEspecial = acusticaEspecial;
    }

    @Override
    public String toString() {
        return super.toString() + " | Auditório | Acústica especial: " + (acusticaEspecial ? "Sim" : "Não");
    }
}
