package view;

import model.Pessoa;

import java.util.List;

public abstract class Menu {
    public abstract void exibir();

    public void exibirMenuPrincipal() {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.exibir();
    }
}
