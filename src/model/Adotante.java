package model;

import java.util.ArrayList;
import java.util.List;

public class Adotante {

    private long idAdotante;
    private List<Preferencia> preferencias = new ArrayList<>();
    private List<Adocao> historicoAdocoes = new ArrayList<>();

    public Adotante(){}

    public Adotante(long idAdotante, List<Preferencia> preferencias, List<Adocao> historicoAdocoes) {
        this.idAdotante = idAdotante;
        this.preferencias = preferencias;
        this.historicoAdocoes = historicoAdocoes;
    }

    // Getters e Setters
    public long getIdAdotante() {
        return idAdotante;
    }

    public void setIdAdotante(long idAdotante) {
        this.idAdotante = idAdotante;
    }

    public List<Preferencia> getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(List<Preferencia> preferencias) {
        this.preferencias = preferencias;
    }

    public List<Adocao> getHistoricoAdocoes() {
        return historicoAdocoes;
    }

    public void setHistoricoAdocoes(List<Adocao> historicoAdocoes) {
        this.historicoAdocoes = historicoAdocoes;
    }

    @Override
    public String toString() {
        return "Adotante{" +
                "numeroIdentificacao=" + idAdotante +
                ", preferencias=" + preferencias +
                ", historicoAdocoes=" + historicoAdocoes +
                '}';
    }
}