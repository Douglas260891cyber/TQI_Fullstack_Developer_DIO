package entities;

public class ContaCorrente extends Conta{
    private final double TAXA = 5.5; 

    public ContaCorrente() {

    }

    public ContaCorrente(Integer agencia, Integer numero, Double saldo) {
        super(agencia, numero, saldo);
        super.setTaxaDeMovimentacao(TAXA);
    }

    @Override
    public void imprimeDadosConta() {
        System.out.println("****** DADOS CONTA CORRENTE ******");        
        super.imprimeDadosConta();
    }

}