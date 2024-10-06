package model;

import java.util.List;

public class Adotante {

    private long numeroIdentificacao;
    private List<Preferencia> preferencias;
    private List<Adocao> historicoAdocoes;

    public Adotante(){}

    public Adotante(long numeroIdentificacao, List<Preferencia> preferencias, List<Adocao> historicoAdocoes) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.preferencias = preferencias;
        this.historicoAdocoes = historicoAdocoes;
    }

    // Getters e Setters
    public long getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(long numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
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
                "numeroIdentificacao=" + numeroIdentificacao +
                ", preferencias=" + preferencias +
                ", historicoAdocoes=" + historicoAdocoes +
                '}';
    }
}