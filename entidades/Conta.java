/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author igorxf
 */
public class Conta {
    private String numC;
    private String Titular;
    private Double Saldo;

    public Conta(String numC, String Titular, Double Saldo) {
        this.numC = numC;
        this.Titular = Titular;
        this.Saldo = Saldo;
    }
    
    public Conta() {
        this.numC = "";
        this.Titular = "";
        this.Saldo = 0.0;
    }


    public String getNumC() {
        return numC;
    }

    public void setNumC(String numC) {
        this.numC = numC;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double Saldo) {
        this.Saldo = Saldo;
    }
    
    public void imprimir(){
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        return "Transacao{" +
                "numC=" + numC +
                ", Titular=" + Titular +
                ", Saldo=" + Saldo + '}';
    }
    
    public void exibirSaldo(){
        System.out.println(getSaldo() + ",00");
    }
    
    public void sacar(double valorS){
        double saldoA = 0.0;
        saldoA = getSaldo() -  valorS;
        setSaldo(saldoA);
    }
    
    public void depositar(double valorS){
        double saldoA = 0.0;
        saldoA = getSaldo() +  valorS;
        setSaldo(saldoA);
    }
}
