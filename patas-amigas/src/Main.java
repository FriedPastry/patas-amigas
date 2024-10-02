import model.Animal;
import model.Pessoa;

import java.util.Date;
import java.util.Scanner;

public class Main {

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
        System.out.println("\n--- Criar Nova model.Pessoa ---");

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
        int CPF = scanner.nextInt();

        System.out.print("Telefone: ");
        int telefone = scanner.nextInt();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        // Você pode definir o ID da pessoa conforme necessário (ex: auto-incremento ou geração manual)
        int idPessoa = 1; // Exemplo de ID fixo

        Pessoa novaPessoa = new Pessoa(idPessoa, nome, dataNascimento, email, endereco, genero, CPF, telefone, senha);

        System.out.println("model.Pessoa criada com sucesso!");
        return novaPessoa;
    }

    private static void exibirPessoa(Pessoa pessoa) {
        System.out.println("\n--- Informações da model.Pessoa ---");
        System.out.println(pessoa.toString());
    }

    private static void editarPessoa(Scanner scanner, Pessoa pessoa) {
        System.out.println("\n--- Editar model.Pessoa ---");

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
        if (!CPF.isEmpty()) pessoa.setCPF(Integer.parseInt(CPF));

        System.out.print("Telefone (" + pessoa.getTelefone() + "): ");
        String telefone = scanner.nextLine();
        if (!telefone.isEmpty()) pessoa.setTelefone(Integer.parseInt(telefone));

        System.out.print("Senha (" + pessoa.getSenha() + "): ");
        String senha = scanner.nextLine();
        if (!senha.isEmpty()) pessoa.setSenha(senha);

        System.out.println("Informações da pessoa atualizadas com sucesso!");
    }


}
