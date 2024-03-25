/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.List;
import servicos.Transacao;

/**
 *
 * @author igorxf
 */
public class Banco {
    private String nome;
    private List<Conta> conta;
    private List<Transacao> transacao;

    public Banco(String nome) {
        this.nome = nome;
        this.conta = new ArrayList<>();
        this.transacao = new ArrayList<>();
    }
    
    public Banco() {
        this.nome = "";
        this.conta = new ArrayList<>();
        this.transacao = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getConta() {
        return conta;
    }

    public void setConta(List<Conta> conta) {
        this.conta = conta;
    }

    public List<Transacao> getTransacao() {
        return transacao;
    }

    public void setTransacao(List<Transacao> transacao) {
        this.transacao = transacao;
    }
    
    public void addConta(Conta conta){
        this.conta.add(conta);
    }
    
    public void removeConta(Conta conta){
        this.conta.remove(conta);
    }
    
    public void removeTransacao(Transacao transacao){
        this.transacao.remove(transacao);
    }
    
    public void addTransacao(Transacao transacao){
        this.transacao.add(transacao);
    }
    
    public List<Conta>  listarConstas(){
        return this.conta;
    }
    
    public List<Transacao>  listarTransacao(){
        return this.transacao;
    }
    
    
    
    public Conta contaMenorSaldo(){
        double menorv = 0.0;
        Conta contaMenor = new Conta();
        for(Conta  a: this.conta){
            if(a.getSaldo() < menorv){
               menorv = a.getSaldo();
               contaMenor = a;
            }    
        }
        return contaMenor;
    }
    
    public Conta contaMaiorSaldo(){
        double maiorv = 0.0;
        Conta contaMenor = new Conta();
        for(Conta  a: this.conta){
            if(a.getSaldo() > maiorv){
               maiorv = a.getSaldo();
               contaMenor = a;
            }    
        }
        return contaMenor;
    }
    
    public int quantDevedor(){
        int i = 0;
        for(Conta  a: this.conta){
            if(a.getSaldo() < 0)
               i++;
     
        }
        return i;
    }
    
    public double totalSaldoNegativo(){
        double saldoNegativo = 0.0;
        for(Conta  a: this.conta){
            if(a.getSaldo() < 0){
               saldoNegativo = saldoNegativo +  a.getSaldo();
            }    
        }
        return saldoNegativo;
    }
    
    public double totalSaldoPositivo(){
        double saldoPositivo = 0.0;
        for(Conta  a: this.conta){
            if(a.getSaldo() > 0){
               saldoPositivo = saldoPositivo +  a.getSaldo();
            }    
        }
        return saldoPositivo;
    }
}
