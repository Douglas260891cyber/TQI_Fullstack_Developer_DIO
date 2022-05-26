package entities;

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
    
}