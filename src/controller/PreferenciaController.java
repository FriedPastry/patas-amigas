package controller;

import model.Preferencia;

import java.util.ArrayList;
import java.util.List;

public class PreferenciaController {
    public static List<Preferencia> preferencias = new ArrayList<>();

    // CREATE
    public static Preferencia postPreferencia(Preferencia preferencia) {
        preferencias.add(preferencia);
        System.out.println("Preferência criada com sucesso!");
        return preferencia;
    }

    // READ
    public static List<Preferencia> getPreferencias() {
        return preferencias;
    }

    // UPDATE
    public static void putPreferencia(long id, Preferencia preferencia) {
        Preferencia preferenciaToUpdate = PreferenciaController.getById(id);

        preferenciaToUpdate.setEspecie(preferencia.getEspecie());
        preferenciaToUpdate.setRaca(preferencia.getRaca());
        preferenciaToUpdate.setIdade(preferencia.getIdade());
        preferenciaToUpdate.setSexo(preferencia.getSexo());

        System.out.println("Informações da preferência atualizadas com sucesso!");
    }

    // READ
    public static Preferencia getById(long id) {
        return preferencias.stream()
                .filter(preferencia -> preferencia.getIdPreferencia() == id)
                .findFirst()
                .orElseThrow();
    }
}
