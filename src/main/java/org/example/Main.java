package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente daniel = new Cliente();
        daniel.setNome("Daniel");
        Conta cc = new ContaCorrente(daniel);
        cc.depositar(100);
        Conta poupanca = new ContaPoupanca(daniel);
        cc.transferir(100, poupanca);
        cc.extrato();
        poupanca.extrato();

    }
}