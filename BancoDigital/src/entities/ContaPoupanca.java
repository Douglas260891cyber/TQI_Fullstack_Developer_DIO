package entities;

<<<<<<< HEAD
public class ContaPoupanca extends Conta {

    private final Double TAXA = 2.0;

    public ContaPoupanca() {

    }

    public ContaPoupanca(Integer agencia, Integer numero, Double saldo, Titular titular) {
        super(agencia, numero, saldo, titular);
        super.setTaxaDeMovimentacao(TAXA);
    }

    @Override
    public void imprimeDadosConta() {
        System.out.println("****** DADOS CONTA POUPANÇA ******");
        super.imprimeDadosConta();
    }
=======
public class ContaPoupanca extends Conta{

    private final Double TAXA = 2.0; 

    public ContaPoupanca(){

    }

    public ContaPoupanca(Integer agencia, Integer numero, Double saldo) {
        super(agencia, numero, saldo); 
        super.setTaxaDeMovimentacao(TAXA);
    }


    @Override
    public void imprimeDadosConta() {
        System.out.println("****** DADOS CONTA POUPANÇA ******");        
        super.imprimeDadosConta();
    }
    
>>>>>>> 761bec10dc468237c2d44276bb6c42636f7b45e7
}