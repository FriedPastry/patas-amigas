package model;

import java.util.Objects;

public class Pessoa {
    private int idPessoa;
    private static int staticId = 1;
    private String nome;
    private String dataNascimento;
    private String email;
    private String endereco;
    private String genero;
    private int CPF;
    private int telefone;
    private String senha;
    private boolean isAdotante;
    private boolean isTutor;
    private boolean isFuncionario;

    public Pessoa() {}

    public Pessoa(String nome, String dataNascimento, String email, String endereco, String genero, int CPF, int telefone, String senha, boolean isAdotante, boolean isTutor, boolean isFuncionario) {
        this.idPessoa = staticId;
        staticId++;

        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.endereco = endereco;
        this.genero = genero;
        this.CPF = CPF;
        this.telefone = telefone;
        this.senha = senha;
        this.isAdotante = isAdotante;
        this.isTutor = isTutor;
        this.isFuncionario = isFuncionario;
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

    public boolean isAdotante() {
        return isAdotante;
    }

    public void setAdotante(boolean adotante) {
        isAdotante = adotante;
    }

    public boolean isTutor() {
        return isTutor;
    }

    public void setTutor(boolean tutor) {
        isTutor = tutor;
    }

    public boolean isFuncionario() {
        return isFuncionario;
    }

    public void setFuncionario(boolean funcionario) {
        isFuncionario = funcionario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa pessoa)) return false;
        return idPessoa == pessoa.idPessoa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPessoa);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "idPessoa=" + idPessoa +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                ", genero='" + genero + '\'' +
                ", CPF=" + CPF +
                ", telefone=" + telefone +
                ", senha='" + senha + '\'' +
                ", isAdotante=" + isAdotante +
                ", isTutor=" + isTutor +
                ", isFuncionario=" + isFuncionario +
                '}';
    }
}
