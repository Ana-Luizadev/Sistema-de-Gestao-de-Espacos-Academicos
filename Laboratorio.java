public class Laboratorio extends Espaco {
    private String tipoEquipamento;

    public Laboratorio(int id, String nome, String localizacao, int capacidade, String tipoEquipamento) {
        super(id, nome, localizacao, capacidade);
        this.tipoEquipamento = tipoEquipamento;
    }

    public String getTipoEquipamento() {
        return tipoEquipamento;
    }

    public void setTipoEquipamento(String tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }

    @Override
    public String toString() {
        return super.toString() + " | Laboratório | Equipamento: " + tipoEquipamento;
    }
}
