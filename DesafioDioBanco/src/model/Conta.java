/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lksmi
 */
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1001;
    private static int SEQUENCIAL = 1000001;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        if (this.saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirInfos() {
        System.out.println(String.format("Titular : %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia : %d", this.agencia));
        System.out.println(String.format("Numero : %d", this.numero));
        System.out.println(String.format("saldo : %.2f", this.saldo));
    }

}
