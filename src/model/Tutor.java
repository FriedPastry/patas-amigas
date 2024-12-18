package model;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private long numeroIdentificacao;
    private int numeroAnimaisSobCustodia;
    private List<Adocao> historicoAdocoes = new ArrayList<>();


    public Tutor() {}

    public Tutor(long numeroIdentificacao, int numeroAnimaisSobCustodia, List<Adocao> historicoAdocoes) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.numeroAnimaisSobCustodia = numeroAnimaisSobCustodia;
        this.historicoAdocoes = historicoAdocoes;
    }


    //Getters e Setters
    public long getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(long numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public int getNumeroAnimaisSobCustodia() {
        return numeroAnimaisSobCustodia;
    }

    public void setNumeroAnimaisSobCustodia(int numeroAnimaisSobCustodia) {
        this.numeroAnimaisSobCustodia = numeroAnimaisSobCustodia;
    }

    public List<Adocao> getHistoricoAdocoes() {
        return historicoAdocoes;
    }

    public void setHistoricoAdocoes(List<Adocao> historicoAdocoes) {
        this.historicoAdocoes = historicoAdocoes;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "numeroIdentificacao=" + numeroIdentificacao +
                ", numeroAnimaisSobCustodia=" + numeroAnimaisSobCustodia +
                ", historicoAdocoes=" + historicoAdocoes +
                '}';
    }
}
