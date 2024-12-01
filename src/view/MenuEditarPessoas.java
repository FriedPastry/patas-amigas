package view;

import controller.PessoaController;
import model.Pessoa;

import java.util.Scanner;

public class MenuEditarPessoas extends Menu {
    @Override
    public void exibir() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Editar Pessoa ---");
        System.out.print("Insira o ID da Pessoa a editar: ");
        long id = Long.parseLong(scanner.nextLine());

        Pessoa pessoa = PessoaController.getById(id);

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

        PessoaController.putPessoa(pessoa.getIdPessoa(), pessoa);

        exibirMenuPrincipal();
    }
}
