package view;

import controller.PessoaController;
import model.Pessoa;

import java.util.List;

public class MenuExibirPessoas extends Menu {

    @Override
    public void exibir() {
        System.out.println("\n--- Lista de pessoas cadastradas ---");

        int maxNome=4, maxData=15, maxEmail=5, maxEndereco=8, maxGenero=6, maxCPF=3, maxTelefone=8, maxSenha=5;

        for (Pessoa pessoas : PessoaController.getPessoas()) {
            String nome = pessoas.getNome();
            String dataNascimento = pessoas.getDataNascimento();
            String email = pessoas.getEmail();
            String endereco = pessoas.getEndereco();
            String genero = pessoas.getGenero();
            String CPF = pessoas.getCPF();
            String telefone = pessoas.getTelefone();
            String senha = pessoas.getSenha();

            maxNome = Math.max(nome.length(), maxNome);
            maxData = Math.max(dataNascimento.length(), maxData);
            maxEmail = Math.max(email.length(), maxEmail);
            maxEndereco = Math.max(endereco.length(), maxEndereco);
            maxGenero = Math.max(genero.length(), maxGenero);
            maxCPF = Math.max(CPF.length(), maxCPF);
            maxTelefone = Math.max(telefone.length(), maxTelefone);
            maxSenha = Math.max(senha.length(), maxSenha);
        }

        System.out.println("|Nome" + " ".repeat(maxNome-4) + "|Data Nascimento" + " ".repeat(maxData - 15) + "|Email" + " ".repeat(maxEmail - 5) + "|Endereço" + " ".repeat(maxEndereco - 8) + "|Gênero" + " ".repeat(maxGenero - 6) + "|CPF" + " ".repeat(maxCPF - 3) + "|Telefone" + " ".repeat(maxTelefone - 8) + "|Senha" + " ".repeat(maxSenha - 5) + "|" + "Adotante|Tutor|Funcionário|");


        for (Pessoa pessoas : PessoaController.getPessoas()) {

            System.out.println("|"+ pessoas.getNome() + " ".repeat(maxNome-pessoas.getNome().length()) + "|" + pessoas.getDataNascimento() + " ".repeat(maxData - pessoas.getDataNascimento().length()) + "|" + pessoas.getEmail() + " ".repeat(maxEmail - pessoas.getEmail().length()) + "|" + pessoas.getEndereco() + " ".repeat(maxEndereco - pessoas.getEndereco().length()) + "|" + pessoas.getGenero() + " ".repeat(maxGenero - pessoas.getGenero().length()) + "|" + pessoas.getCPF() + " ".repeat(maxCPF - pessoas.getCPF().length()) + "|" + pessoas.getTelefone() + " ".repeat(maxTelefone - pessoas.getTelefone().length()) + "|" + pessoas.getSenha() + " ".repeat(maxSenha - pessoas.getSenha().length()) + "|" + Boolean.toString(pessoas.isAdotante()).charAt(0) + "       |" + Boolean.toString(pessoas.isTutor()).charAt(0) + "    |" + Boolean.toString(pessoas.isFuncionario()).charAt(0) + "          |");

        }

        System.out.println();
        System.out.println();
        exibirMenuPrincipal();
    }
}
