public class Espaco {
    import java.util.HashMap;
import java.util.Map;

public abstract class Espaco {
    protected int id;
    protected String nome;
    protected String localizacao;
    protected int capacidade;

    // Horários reservados: true = reservado, false = disponível
    protected Map<String, Boolean> disponibilidade;

    public Espaco(int id, String nome, String localizacao, int capacidade) {
        this.id = id;
        this.nome = nome;
        this.localizacao = localizacao;
        this.capacidade = capacidade;
        this.disponibilidade = new HashMap<>();
    }

    // ---------- GETTERS E SETTERS ----------
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    // ---------- MÉTODOS DE RESERVA ----------
    public boolean isDisponivel(String horario) {
        return !disponibilidade.getOrDefault(horario, false);
    }

    public boolean reservar(String horario) {
        if (isDisponivel(horario)) {
            disponibilidade.put(horario, true);
            return true;
        }
        return false;
    }

    public void cancelarReserva(String horario) {
        disponibilidade.put(horario, false);
    }

    // ---------- EXIBIÇÃO PADRÃO ----------
    public String toString() {
        return "Espaço: " + nome +
               " | Local: " + localizacao +
               " | Capacidade: " + capacidade;
    }
}

}
