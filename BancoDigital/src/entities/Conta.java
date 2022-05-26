package entities;

import interfaces.IInterfaceMetodos;

public class Conta implements IInterfaceMetodos {

    private Integer agencia;
    private Integer numero;
    private Double saldo;
    private Double taxaDeMovimentacao;
    private Titular titular;

    public Conta() {
    }

    public Conta(Integer agencia, Integer numero, Double saldo, Titular titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
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

    public Titular titular() {
        return this.titular;
    }

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
<<<<<<< HEAD
            this.saldo -= (valor + taxaDeMovimentacao);
=======
            this.saldo -= valor;
>>>>>>> 761bec10dc468237c2d44276bb6c42636f7b45e7
            return true;
        } else
            return false;
    }

    @Override
    public boolean depositar(double valor) {
<<<<<<< HEAD
        this.saldo += (valor - taxaDeMovimentacao);
=======
        this.saldo += valor;
>>>>>>> 761bec10dc468237c2d44276bb6c42636f7b45e7
        return true;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
<<<<<<< HEAD
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimeDadosConta() {
        System.out.println("Número:  " + this.numero + "\n" +
                "Agência:  " + this.agencia + "\n" +
                "Saldo:  " + this.saldo + "\n" + this.titular);
    }

=======
         this.sacar(valor); 
         contaDestino.depositar(valor); 
    }

    protected void imprimeDadosConta(){
        System.out.println("Número:  " + this.numero + "\n" + 
                           "Agência:  " + this.agencia + "\n" + 
                           "Saldo:  " + this.saldo + "\n"
                           );
    }

    

    
>>>>>>> 761bec10dc468237c2d44276bb6c42636f7b45e7
}