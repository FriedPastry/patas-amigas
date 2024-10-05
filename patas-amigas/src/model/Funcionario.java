package model;

public class Funcionario {

    private long numeroIdentificacao;
    private String dataContratacao;
    private String cargo;
    private float salario;
    private String departamento;

    //Construtor

    public Funcionario(long numeroIdentificacao, String dataContratacao, String cargo, float salario, String departamento) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.dataContratacao = dataContratacao;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    //Getters e Setters

    public long getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(long numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
