package org.example;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.println("==== Extrato Conta Poupanca ====");
        System.out.println(String.format("Agencia: %d", super.agencia));
        System.out.println(String.format("Numero: %d", super.numeroConta));
        System.out.println(String.format("Saldo Atual: %.2f", super.saldo));
        System.out.println(String.format("Titular: %s", super.cliente.getNome()));
    }
}
