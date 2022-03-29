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
public interface IConta {
    
    void sacar(double valor);
    
    void depositar(double valor);
    
    void transferir(Conta contaDestino, double valor);
    
    void gerarExtrato();
}
