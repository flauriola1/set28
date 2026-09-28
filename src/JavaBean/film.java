package JavaBean;

import java.util.Objects;

public class film {

    private int idFilm;
    private String titolo;
    private String genere;
    private int durata;
    private int anno;

    // Costruttore vuoto
    public film() {
    }

    // Costruttore completo (con ID)
    public film(int idFilm, String titolo, String genere, int durata, int anno) {
        this.idFilm = idFilm;
        this.titolo = titolo;
        this.genere = genere;
        this.durata = durata;
        this.anno = anno;
    }

    // Costruttore per nuovi inserimenti (senza ID auto-incrementale)
    public film(String titolo, String genere, int durata, int anno) {
        this.titolo = titolo;
        this.genere = genere;
        this.durata = durata;
        this.anno = anno;
    }

    // --- GETTER e SETTER ---

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Film{" +
                "idFilm=" + idFilm +
                ", titolo='" + titolo + '\'' +
                ", genere='" + genere + '\'' +
                ", durata=" + durata +
                ", anno=" + anno +
                '}';
    }
}