public class QuadraEsportiva extends Espaco {
    private String tipoEsporte; // Ex: futsal, vôlei

    public QuadraEsportiva(int id, String nome, String localizacao, int capacidade, String tipoEsporte) {
        super(id, nome, localizacao, capacidade);
        this.tipoEsporte = tipoEsporte;
    }

    public String getTipoEsporte() {
        return tipoEsporte;
    }

    public void setTipoEsporte(String tipoEsporte) {
        this.tipoEsporte = tipoEsporte;
    }

    @Override
    public String toString() {
        return super.toString() + " | Quadra Esportiva | Tipo: " + tipoEsporte;
    }
}
