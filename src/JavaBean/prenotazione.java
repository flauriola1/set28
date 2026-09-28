package JavaBean;

import java.time.LocalDateTime;
import java.util.Objects;

public class prenotazione {

    private int idPrenotazione;
    private LocalDateTime dataSpettacolo;
    private int fkIdFilm;
    private int fkIdSala;
    private int numeroPosto;

    // Costruttore vuoto
    public prenotazione() {
    }

    // Costruttore completo (con ID)
    public prenotazione(int idPrenotazione, LocalDateTime dataSpettacolo, int fkIdFilm, int fkIdSala, int numeroPosto) {
        this.idPrenotazione = idPrenotazione;
        this.dataSpettacolo = dataSpettacolo;
        this.fkIdFilm = fkIdFilm;
        this.fkIdSala = fkIdSala;
        this.numeroPosto = numeroPosto;
    }

    // Costruttore per nuovi inserimenti (senza ID auto-incrementale)
    public prenotazione(LocalDateTime dataSpettacolo, int fkIdFilm, int fkIdSala, int numeroPosto) {
        this.dataSpettacolo = dataSpettacolo;
        this.fkIdFilm = fkIdFilm;
        this.fkIdSala = fkIdSala;
        this.numeroPosto = numeroPosto;
    }

    // --- GETTER e SETTER ---

    public int getIdPrenotazione() {
        return idPrenotazione;
    }

    public void setIdPrenotazione(int idPrenotazione) {
        this.idPrenotazione = idPrenotazione;
    }

    public LocalDateTime getDataSpettacolo() {
        return dataSpettacolo;
    }

    public void setDataSpettacolo(LocalDateTime dataSpettacolo) {
        this.dataSpettacolo = dataSpettacolo;
    }

    public int getFkIdFilm() {
        return fkIdFilm;
    }

    public void setFkIdFilm(int fkIdFilm) {
        this.fkIdFilm = fkIdFilm;
    }

    public int getFkIdSala() {
        return fkIdSala;
    }

    public void setFkIdSala(int fkIdSala) {
        this.fkIdSala = fkIdSala;
    }

    public int getNumeroPosto() {
        return numeroPosto;
    }

    public void setNumeroPosto(int numeroPosto) {
        this.numeroPosto = numeroPosto;
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "idPrenotazione=" + idPrenotazione +
                ", dataSpettacolo=" + dataSpettacolo +
                ", fkIdFilm=" + fkIdFilm +
                ", fkIdSala=" + fkIdSala +
                ", numeroPosto=" + numeroPosto +
                '}';
    }
}