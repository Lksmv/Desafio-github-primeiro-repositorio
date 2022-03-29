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
public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void gerarExtrato() {
        System.out.println("***Extrato conta Corrente***");
        super.imprimirInfos();
    }
}
