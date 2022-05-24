package interfaces;

import entities.Conta;

public interface IInterfaceMetodos {
    public void sacar(double valor);
    public void depositar(double valor);
    public void transferir(double valor, Conta contaDestino);    
}