package controller;

import view.*;
import model.Pessoa;

import java.util.*;

public class PessoaController {
    // Creating a list to store every person generated
    public static List<Pessoa> pessoas = new ArrayList<>();

    // CREATE
    public static Pessoa postPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
        System.out.println("Pessoa criada com sucesso!");
        return pessoa;
    }

    // READ
    public static List<Pessoa> getPessoas() {
        return pessoas;
    }

    // UPDATE
    public static void putPessoa(long id, Pessoa pessoa) {
        Pessoa pessoaToUpdate = PessoaController.getById(id);

        pessoaToUpdate.setFuncionario(pessoa.isFuncionario());
        pessoaToUpdate.setTutor(pessoa.isTutor());
        pessoaToUpdate.setAdotante(pessoa.isAdotante());
        pessoaToUpdate.setTipo(pessoa.getTipo());
        pessoaToUpdate.setCPF(pessoa.getCPF());
        pessoaToUpdate.setSenha(pessoa.getSenha());
        pessoaToUpdate.setTelefone(pessoa.getTelefone());
        pessoaToUpdate.setNome(pessoa.getNome());
        pessoaToUpdate.setDataNascimento(pessoa.getDataNascimento());
        pessoaToUpdate.setEmail(pessoa.getEmail());
        pessoaToUpdate.setEndereco(pessoa.getEndereco());
        pessoaToUpdate.setGenero(pessoa.getGenero());

        System.out.println("Informações da pessoa atualizadas com sucesso!");
    }

    // READ
    public static Pessoa getById(long id) {
        return pessoas.stream()
                .filter(pessoa -> pessoa.getIdPessoa() == id)
                .findFirst()
                .orElseThrow();
    }

    public static Pessoa getByName(String nome) {
        return pessoas.stream()
            .filter(pessoa -> pessoa.getNome().equals(nome))
            .findFirst()
            .orElseThrow();
    }
}
