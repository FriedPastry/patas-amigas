package controller;

import model.Adotante;
import model.Preferencia;

import java.util.ArrayList;
import java.util.List;

public class AdotanteController {
    // Creating a list to store every person generated
    public static List<Adotante> adotantes = new ArrayList<>();

    // CREATE
    public static Adotante postAdotante(Adotante adotante) {
        adotantes.add(adotante);
        System.out.println("Adotante criada com sucesso!");
        return adotante;
    }

    // READ
    public static List<Adotante> getAdotantes() {
        return adotantes;
    }

    // UPDATE
    public static void putAdotante(long id, Adotante adotante) {
        Adotante adotanteToUpdate = AdotanteController.getById(id);

        adotanteToUpdate.setHistoricoAdocoes(adotante.getHistoricoAdocoes());
        adotanteToUpdate.setPreferencias(adotante.getPreferencias());

        System.out.println("Informações do adotante atualizadas com sucesso!");
    }

    // READ
    public static Adotante getById(long id) {
        return adotantes.stream()
                .filter(adotante -> adotante.getIdAdotante() == id)
                .findFirst()
                .orElseThrow();
    }

    public static List<Preferencia> getPreferencias() {
       return PreferenciaController.getPreferencias();
    }
}
