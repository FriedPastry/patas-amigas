package view;

import controller.PessoaController;
import model.Adotante;
import model.Funcionario;
import model.Pessoa;
import model.Tutor;

import java.util.Scanner;

public class MenuCriarPessoa extends Menu implements Criador<Pessoa> {
    Pessoa novaPessoa;

    @Override
    public void exibir() {
        Scanner scanner = new Scanner(System.in);

        novaPessoa = new Pessoa();
        System.out.println("\n--- Criar Nova Pessoa ---");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        novaPessoa.setNome(nome);

        System.out.print("Data de nascimento: ");
        String dataNascimento = scanner.nextLine();
        novaPessoa.setDataNascimento(dataNascimento);

        System.out.print("Email: ");
        String email = scanner.nextLine();
        novaPessoa.setEmail(email);

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        novaPessoa.setEndereco(endereco);

        System.out.print("Gênero: ");
        String genero = scanner.nextLine();
        novaPessoa.setGenero(genero);

        System.out.print("CPF: ");
        String CPF = scanner.nextLine();
        novaPessoa.setCPF(CPF);

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        novaPessoa.setTelefone(telefone);

        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        novaPessoa.setSenha(senha);

        // Adotante
        String opcaoAdotante;
        boolean isAdotante;
        do {
            System.out.print("Adotante (s/n): ");
            opcaoAdotante = scanner.nextLine();
            isAdotante = opcaoAdotante.equals("s");
        } while (!opcaoAdotante.equals("s") && !opcaoAdotante.equals("n"));
        if (isAdotante) {
            MenuCriarAdotante menuCriarAdotante = new MenuCriarAdotante();
            menuCriarAdotante.exibir();

            Adotante adotante = menuCriarAdotante.get();
            novaPessoa.setAdotante(true);
            novaPessoa.setAdotante(adotante);
        }

        // Tutor
        String opcaoTutor;
        boolean isTutor;
        do {
            System.out.print("Tutor (s/n): ");
            opcaoTutor = scanner.nextLine();
            isTutor = opcaoTutor.equals("s");
        } while (!opcaoTutor.equals("s") && !opcaoTutor.equals("n"));
        if (isTutor) {
            MenuCriarTutor menuCriarTutor = new MenuCriarTutor();
            menuCriarTutor.exibir();

            Tutor tutor = menuCriarTutor.get();
            novaPessoa.setTutor(true);
            novaPessoa.setTutor(tutor);
        }

        // Funcionário
        String opcaoFuncionario;
        boolean isFuncionario;
        do {
            System.out.print("Funcionário (s/n): ");
            opcaoFuncionario = scanner.nextLine();
            isFuncionario = opcaoFuncionario.equals("s");
        } while (!opcaoFuncionario.equals("s") && !opcaoFuncionario.equals("n"));
        if (isFuncionario) {
            MenuCriarFuncionario menuCriarFuncionario = new MenuCriarFuncionario();
            menuCriarFuncionario.exibir();

            Funcionario funcionario = menuCriarFuncionario.get();
            novaPessoa.setFuncionario(true);
            novaPessoa.setFuncionario(funcionario);
        }

        PessoaController.postPessoa(novaPessoa);

        exibirMenuPrincipal();
    }

    @Override
    public Pessoa get() {
        return novaPessoa;
    }
}
