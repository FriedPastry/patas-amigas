package model;

public class Preferencia {
    private long idPreferencia;
    private String especie;
    private String raca;
    private int idade;
    private String sexo;

    // Constructor
    public Preferencia() {}

    public Preferencia(String especie, String raca, int idade, String sexo) {
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Getters and Setters
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public long getIdPreferencia() {
        return idPreferencia;
    }

    public void setIdPreferencia(long idPreferencia) {
        this.idPreferencia = idPreferencia;
    }
}
