package model;

import java.util.Objects;

public class Pessoa {
    private int idPessoa;
    private String nome;
    private String dataNascimento;
    private String email;
    private String endereco;
    private String genero;
    private int CPF;
    private int telefone;
    private String senha;

    public Pessoa() {}

    public Pessoa(int idPessoa, String nome, String dataNascimento, String email, String endereco, String genero, int CPF, int telefone, String senha) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.endereco = endereco;
        this.genero = genero;
        this.CPF = CPF;
        this.telefone = telefone;
        this.senha = senha;
    }

    // Getters e Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa pessoa)) return false;
        return idPessoa == pessoa.idPessoa && getCPF() == pessoa.getCPF() && getTelefone() == pessoa.getTelefone() && Objects.equals(getNome(), pessoa.getNome()) && Objects.equals(getDataNascimento(), pessoa.getDataNascimento()) && Objects.equals(getEmail(), pessoa.getEmail()) && Objects.equals(getEndereco(), pessoa.getEndereco()) && Objects.equals(getGenero(), pessoa.getGenero()) && Objects.equals(getSenha(), pessoa.getSenha());
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPessoa, getNome(), getDataNascimento(), getEmail(), getEndereco(), getGenero(), getCPF(), getTelefone(), getSenha());
    }

    @Override
    public String toString() {
        return "model.Pessoa{" +
                "idPessoa=" + idPessoa +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                ", genero='" + genero + '\'' +
                ", CPF=" + CPF +
                ", telefone=" + telefone +
                ", senha='" + senha + '\'' +
                '}';
    }
}
