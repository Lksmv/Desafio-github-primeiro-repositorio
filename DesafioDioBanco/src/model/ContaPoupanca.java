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
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void gerarExtrato() {
        System.out.println("***Extrato conta poupanca***");
        super.imprimirInfos();
    }

}
