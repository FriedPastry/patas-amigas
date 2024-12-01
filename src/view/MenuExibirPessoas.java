package view;

import controller.PessoaController;
import model.Pessoa;

import java.util.List;

public class MenuExibirPessoas extends Menu {

    @Override
    public void exibir() {
        System.out.println("\n--- Lista de pessoas cadastradas ---");
        PessoaController.getPessoas().forEach(System.out::println);

        exibirMenuPrincipal();
    }
}
