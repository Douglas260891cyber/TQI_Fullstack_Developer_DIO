package entities;

import interfaces.IInterfaceMetodos;

public class Conta implements IInterfaceMetodos{

    private Integer agencia;
    private Integer numero;
    private Double saldo;
    private Double taxaDeMovimentacao; 

    public Conta() {
    }

    public Conta(Integer agencia, Integer numero, Double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public Integer getAgencia() {
        return this.agencia;
    }


    public Integer getNumero() {
        return this.numero;
    }


    public Double getSaldo() {
        return this.saldo;
    }

    public Double getTaxaDeMovimentacao() {
        return this.taxaDeMovimentacao;
    }

    public void setTaxaDeMovimentacao(Double taxaDeMovimentacao) {
        this.taxaDeMovimentacao = taxaDeMovimentacao;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else
            return false;
    }

    @Override
    public boolean depositar(double valor) {
        this.saldo += valor;
        return true;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
         this.sacar(valor); 
         contaDestino.depositar(valor); 
    }

    protected void imprimeDadosConta(){
        System.out.println("Número:  " + this.numero + "\n" + 
                           "Agência:  " + this.agencia + "\n" + 
                           "Saldo:  " + this.saldo + "\n"
                           );
    }

    

    
}