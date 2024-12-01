package view;

import model.Pessoa;
import model.Tutor;

import java.util.Scanner;

public class MenuCriarTutor extends Menu implements Criador<Tutor> {
    Tutor novoTutor;

    @Override
    public void exibir() {
        Scanner scanner = new Scanner(System.in);

        novoTutor = new Tutor();
        System.out.println("\n--- Criar Novo Tutor ---");

        System.out.print("Número de animais sob custódia: ");
        int numeroAnimaisSobCustodia = Integer.parseInt(scanner.nextLine());
        novoTutor.setNumeroAnimaisSobCustodia(numeroAnimaisSobCustodia);
    }

    @Override
    public Tutor get() {
        return novoTutor;
    }

}
