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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco banco = new Banco("Caixa");
        
        Cliente cliente1 = new Cliente("Cliente 1", 30, 8909800);
        Conta cc = new ContaCorrente(cliente1);
        banco.addConta(cc);
        Cliente cliente2 = new Cliente("cliente 2", 25, 9912380);
        Conta cp = new ContaPoupanca(cliente2);
        banco.addConta(cp);
        banco.listarContas();

        cc.depositar(100);
        cc.transferir(cp, 100);

        cc.gerarExtrato();
        cp.gerarExtrato();

    }

}
