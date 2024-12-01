package view;

import controller.PreferenciaController;
import model.Preferencia;

import java.util.Scanner;

public class MenuCriarPreferencia extends Menu implements Criador<Preferencia> {
    Preferencia novaPreferencia;

    @Override
    public void exibir() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Criar Nova Preferência ---");
        novaPreferencia = new Preferencia();

        System.out.print("Espécie: ");
        String especie = scanner.nextLine();
        novaPreferencia.setEspecie(especie);

        System.out.print("Raça: ");
        String raca = scanner.nextLine();
        novaPreferencia.setRaca(raca);

        System.out.print("Idade: ");
        int idade = Integer.parseInt(scanner.nextLine());
        novaPreferencia.setIdade(idade);

        System.out.print("Sexo: ");
        String sexo = scanner.nextLine();
        novaPreferencia.setSexo(sexo);

        PreferenciaController.postPreferencia(novaPreferencia);
    }

    @Override
    public Preferencia get() {
        return novaPreferencia;
    }
}
