package view;

import java.util.Scanner;

import controller.PessoaController;
import model.Pessoa;

public class MenuFIltrar extends Menu{

    @Override
    public void exibir() {

        Scanner scanner = new Scanner(System.in);

        int maxNome=4, maxData=15, maxEmail=5, maxEndereco=8, maxGenero=6, maxCPF=3, maxTelefone=8, maxSenha=5;

        System.out.println("Digite um nome de uma pessoa para filtrar:");

        String nome_digitado = scanner.nextLine();

        Pessoa pessoa_pesquisada = PessoaController.getByName(nome_digitado);

        maxNome = Math.max(pessoa_pesquisada.getNome().length(), maxNome);
        maxData = Math.max(pessoa_pesquisada.getDataNascimento().length(), maxData);
        maxEmail = Math.max(pessoa_pesquisada.getEmail().length(), maxEmail);
        maxEndereco = Math.max(pessoa_pesquisada.getEndereco().length(), maxEndereco);
        maxGenero = Math.max(pessoa_pesquisada.getGenero().length(), maxGenero);
        maxCPF = Math.max(pessoa_pesquisada.getCPF().length(), maxCPF);
        maxTelefone = Math.max(pessoa_pesquisada.getTelefone().length(), maxTelefone);
        maxSenha = Math.max(pessoa_pesquisada.getSenha().length(), maxSenha);

        
        System.out.println("|Nome" + " ".repeat(maxNome-4) + "|Data Nascimento" + " ".repeat(maxData - 15) + "|Email" + " ".repeat(maxEmail - 5) + "|Endereço" + " ".repeat(maxEndereco - 8) + "|Gênero" + " ".repeat(maxGenero - 6) + "|CPF" + " ".repeat(maxCPF - 3) + "|Telefone" + " ".repeat(maxTelefone - 8) + "|Senha" + " ".repeat(maxSenha - 5) + "|" + "Adotante|Tutor|Funcionário|");
        System.out.println("|"+ pessoa_pesquisada.getNome() + " ".repeat(maxNome-pessoa_pesquisada.getNome().length()) + "|" + pessoa_pesquisada.getDataNascimento() + " ".repeat(maxData - pessoa_pesquisada.getDataNascimento().length()) + "|" + pessoa_pesquisada.getEmail() + " ".repeat(maxEmail - pessoa_pesquisada.getEmail().length()) + "|" + pessoa_pesquisada.getEndereco() + " ".repeat(maxEndereco - pessoa_pesquisada.getEndereco().length()) + "|" + pessoa_pesquisada.getGenero() + " ".repeat(maxGenero - pessoa_pesquisada.getGenero().length()) + "|" + pessoa_pesquisada.getCPF() + " ".repeat(maxCPF - pessoa_pesquisada.getCPF().length()) + "|" + pessoa_pesquisada.getTelefone() + " ".repeat(maxTelefone - pessoa_pesquisada.getTelefone().length()) + "|" + pessoa_pesquisada.getSenha() + " ".repeat(maxSenha - pessoa_pesquisada.getSenha().length()) + "|" + Boolean.toString(pessoa_pesquisada.isAdotante()).charAt(0) + "       |" + Boolean.toString(pessoa_pesquisada.isTutor()).charAt(0) + "    |" + Boolean.toString(pessoa_pesquisada.isFuncionario()).charAt(0) + "          |");

    }
    
}
