package interfaces;

import entities.Conta;

public interface IInterfaceMetodos {
    public boolean sacar(double valor);
    public boolean depositar(double valor); 
    public void transferir(double valor, Conta contaDestino);    
}