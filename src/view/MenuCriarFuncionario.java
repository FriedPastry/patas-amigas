package view;

import model.Funcionario;

import java.util.Scanner;

public class MenuCriarFuncionario extends Menu implements Criador<Funcionario> {
    Funcionario novoFuncionario;

    @Override
    public void exibir() {
        Scanner scanner = new Scanner(System.in);

        novoFuncionario = new Funcionario();
        System.out.println("\n--- Criar Novo Funcionário ---");

        System.out.print("Data de Contratação: ");
        String dataContratacao = scanner.nextLine();
        novoFuncionario.setDataContratacao(dataContratacao);

        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();
        novoFuncionario.setCargo(cargo);

        System.out.print("Salário: ");
        double salario = Double.parseDouble(scanner.nextLine());
        novoFuncionario.setSalario(salario);

        System.out.print("Departamento: ");
        String departamento = scanner.nextLine();
        novoFuncionario.setDepartamento(departamento);
    }

    @Override
    public Funcionario get() {
        return novoFuncionario;
    }

}
