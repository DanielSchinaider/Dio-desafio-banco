package org.example;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public List<String> getClientes() {
        List<String> clienteName = new ArrayList<>();
        for (int i = 0; i < contas.size(); i++) {
            clienteName.add(contas.get(i).cliente.getNome());
        }
        return clienteName;
    }

    public List<Integer> getContas() {
        List<Integer> numeroContas = new ArrayList<>();
        for (int i = 0; i < contas.size(); i++) {
            numeroContas.add(contas.get(i).getNumeroConta());
        }
        return numeroContas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
