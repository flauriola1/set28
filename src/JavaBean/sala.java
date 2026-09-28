package JavaBean;


import java.util.Objects;

public class sala {

    private int idSala;
    private String nomeSala;
    private int capacita;

    // Costruttore vuoto
    public sala() {
    }

    // Costruttore completo (con ID)
    public sala(int idSala, String nomeSala, int capacita) {
        this.idSala = idSala;
        this.nomeSala = nomeSala;
        this.capacita = capacita;
    }

    // Costruttore per nuovi inserimenti (senza ID auto-incrementale)
    public sala(String nomeSala, int capacita) {
        this.nomeSala = nomeSala;
        this.capacita = capacita;
    }

    // --- GETTER e SETTER ---

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public String getNomeSala() {
        return nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public int getCapacita() {
        return capacita;
    }

    public void setCapacita(int capacita) {
        this.capacita = capacita;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "idSala=" + idSala +
                ", nomeSala='" + nomeSala + '\'' +
                ", capacita=" + capacita +
                '}';
    }
}