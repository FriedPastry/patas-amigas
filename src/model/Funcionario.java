package model;

public class Funcionario {

    private long numeroIdentificacao;
    private String dataContratacao;
    private String cargo;
    private double salario;
    private String departamento;

    public Funcionario() {}

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "numeroIdentificacao=" + numeroIdentificacao +
                ", dataContratacao='" + dataContratacao + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
