/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lksmi
 */
public class Banco {
    
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<Conta>();
    }
    
    public void addConta(Conta novaConta){
        contas.add(novaConta);
    }
    
    public void listarContas(){
        for(int i=0;i<contas.size();i++){
            System.out.println("Num: "+contas.get(i).getNumero()+" Agencia: "+contas.get(i).agencia);
        }
    }
    
    
    
}
