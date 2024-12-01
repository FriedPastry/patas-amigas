package view;

import controller.AdotanteController;
import model.Adocao;
import model.Adotante;
import model.Preferencia;

import java.util.Scanner;

public class MenuCriarAdotante extends Menu implements Criador<Adotante> {

    private Adotante novoAdotante;

    @Override
    public void exibir() {
        Scanner scanner = new Scanner(System.in);

        novoAdotante = new Adotante();
        System.out.println("\n--- Criar Novo Adotante ---");

        // Criação Preferência
        String opcaoPreferencia;
        do {
            do {
                System.out.print("Deseja adicionar uma preferência? (s/n): ");
                opcaoPreferencia = scanner.nextLine();
            } while (!opcaoPreferencia.equalsIgnoreCase("s") && !opcaoPreferencia.equalsIgnoreCase("n"));
            if (opcaoPreferencia.equalsIgnoreCase("s")) {
                MenuCriarPreferencia menuCriarPreferencia = new MenuCriarPreferencia();
                menuCriarPreferencia.exibir();

                Preferencia preferencia = menuCriarPreferencia.get();
                novoAdotante.getPreferencias().add(preferencia);
            }
        } while (!opcaoPreferencia.equalsIgnoreCase("n"));

        AdotanteController.postAdotante(novoAdotante);
    }

    @Override
    public Adotante get() {
        return novoAdotante;
    }
}
