package scr.modelos;
public class SalaDeReuniao extends Espaco {
    private boolean temVideoConferencia;

    public SalaDeReuniao(int id, String nome, String localizacao, int capacidade, boolean temVideoConferencia) {
        super(id, nome, localizacao, capacidade);
        this.temVideoConferencia = temVideoConferencia;
    }

    public boolean isVideoConferenciaDisponivel() {
        return temVideoConferencia;
    }

    public void setVideoConferencia(boolean temVideoConferencia) {
        this.temVideoConferencia = temVideoConferencia;
    }

    @Override
    public String toString() {
        return super.toString() + " | Sala de Reunião | Videoconferência: " + (temVideoConferencia ? "Sim" : "Não");
    }
}
