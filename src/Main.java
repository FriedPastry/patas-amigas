import model.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Creating a list to store every person generated
    public static List <Pessoa> pessoas = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Bem-vindo ao sistema de gerenciamento de Pessoas!");

        boolean running = true;
        while (running) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Criar nova pessoa");
            System.out.println("2. Exibir informações da pessoa");
            System.out.println("3. Editar informações da pessoa");
            System.out.println("4. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    pessoa = criarPessoa(scanner);
                    pessoas.add(pessoa);
                    break;
                case 2:
                    exibirPessoa(pessoa);
                    break;
                case 3:
                    editarPessoa(scanner, pessoa);
                    break;
                case 4:
                    running = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static Pessoa criarPessoa(Scanner scanner) {
        System.out.println("\n--- Criar Nova Pessoa ---");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Data de nascimento: ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Gênero: ");
        String genero = scanner.nextLine();

        System.out.print("CPF: ");
        String CPF = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        String opcaoAdotante = "";
        boolean isAdotante;
        do {
            System.out.print("Adotante (s/n): ");
            opcaoAdotante = scanner.nextLine();
            isAdotante = opcaoAdotante.equals("s");
        } while (!opcaoAdotante.equals("s") && !opcaoAdotante.equals("n"));

        String opcaoTutor = "";
        boolean isTutor;
        do {
            System.out.print("Tutor (s/n): ");
            opcaoTutor = scanner.nextLine();
            isTutor = opcaoTutor.equals("s");
        } while (!opcaoTutor.equals("s") && !opcaoTutor.equals("n"));

        String opcaoFuncionario = "";
        boolean isFuncionario;
        do {
            System.out.print("Funcionário (s/n): ");
            opcaoFuncionario = scanner.nextLine();
            isFuncionario = opcaoFuncionario.equals("s");
        } while (!opcaoFuncionario.equals("s") && !opcaoFuncionario.equals("n"));

        Pessoa novaPessoa = new Pessoa(nome, dataNascimento, email, endereco, genero, CPF, telefone, senha, isAdotante, isTutor, isFuncionario);

        System.out.println("Pessoa criada com sucesso!");
        return novaPessoa;
    }

    private static void exibirPessoa(Pessoa pessoa) {
        System.out.println("\n--- Lista de pessoas cadastradas ---");
        pessoas.forEach(System.out::println);
    }

    private static void editarPessoa(Scanner scanner, Pessoa pessoa) {
        System.out.println("\n--- Editar Pessoa ---");

        System.out.print("Nome (" + pessoa.getNome() + "): ");
        String nome = scanner.nextLine();
        if (!nome.isEmpty()) pessoa.setNome(nome);

        System.out.print("Data de nascimento (" + pessoa.getDataNascimento() + "): ");
        String dataNascimento = scanner.nextLine();
        if (!dataNascimento.isEmpty()) pessoa.setDataNascimento(dataNascimento);

        System.out.print("Email (" + pessoa.getEmail() + "): ");
        String email = scanner.nextLine();
        if (!email.isEmpty()) pessoa.setEmail(email);

        System.out.print("Endereço (" + pessoa.getEndereco() + "): ");
        String endereco = scanner.nextLine();
        if (!endereco.isEmpty()) pessoa.setEndereco(endereco);

        System.out.print("Gênero (" + pessoa.getGenero() + "): ");
        String genero = scanner.nextLine();
        if (!genero.isEmpty()) pessoa.setGenero(genero);

        System.out.print("CPF (" + pessoa.getCPF() + "): ");
        String CPF = scanner.nextLine();
        if (!CPF.isEmpty()) pessoa.setCPF(CPF);

        System.out.print("Telefone (" + pessoa.getTelefone() + "): ");
        String telefone = scanner.nextLine();
        if (!telefone.isEmpty()) pessoa.setTelefone(telefone);

        System.out.print("Senha (" + pessoa.getSenha() + "): ");
        String senha = scanner.nextLine();
        if (!senha.isEmpty()) pessoa.setSenha(senha);

        // Adotante
        System.out.print("Adotante (s/n) (" + pessoa.isAdotante() + "): ");
        String opcaoAdotante = "";
        boolean isAdotante;
        do {
            opcaoAdotante = scanner.nextLine();
            isAdotante = opcaoAdotante.equals("s");
        } while (!opcaoAdotante.equals("s") && !opcaoAdotante.equals("n"));
        pessoa.setAdotante(isAdotante);

        // Tutor
        System.out.print("Tutor (s/n) (" + pessoa.isTutor() + "): ");
        String opcaoTutor = "";
        boolean isTutor;
        do {
            opcaoTutor = scanner.nextLine();
            isTutor = opcaoTutor.equals("s");
        } while (!opcaoTutor.equals("s") && !opcaoTutor.equals("n"));
        pessoa.setTutor(isTutor);

        // Funcionário
        System.out.print("Funcionário (s/n) (" + pessoa.isFuncionario() + "): ");
        String opcaoFuncionario = "";
        boolean isFuncionario;
        do {
            opcaoFuncionario = scanner.nextLine();
            isFuncionario = opcaoFuncionario.equals("s");
        } while (!opcaoFuncionario.equals("s") && !opcaoFuncionario.equals("n"));
        pessoa.setFuncionario(isFuncionario);



        System.out.println("Informações da pessoa atualizadas com sucesso!");
    }


}
