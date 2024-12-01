package view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuPrincipal extends Menu {

    @Override
    public void exibir() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de gerenciamento de Pessoas!");
        System.out.println("\nEscolha uma opção:");
        System.out.println("1. Criar nova pessoa");
        System.out.println("2. Exibir informações das pessoas");
        System.out.println("3. Editar informações da pessoa");
        System.out.println("4. Sair");

        Map<Integer, Menu> opcoes = new HashMap<>();
        opcoes.put(1, new MenuCriarPessoa());
        opcoes.put(2, new MenuExibirPessoas());
        opcoes.put(3, new MenuEditarPessoas());
        opcoes.put(4, new MenuSair());

        int choice = Integer.parseInt(scanner.nextLine());
        Menu menu;
        if (opcoes.containsKey(choice)) {
            menu = opcoes.get(choice);
            menu.exibir();
        }
        else {
            System.out.println("Opção inválida. Tente novamente.");
            exibir();
        }

        scanner.close();
    }
}
