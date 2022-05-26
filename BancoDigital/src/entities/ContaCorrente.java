package entities;

<<<<<<< HEAD
public class ContaCorrente extends Conta {
    private final double TAXA = 5.5;
=======
public class ContaCorrente extends Conta{
    private final double TAXA = 5.5; 
>>>>>>> 761bec10dc468237c2d44276bb6c42636f7b45e7

    public ContaCorrente() {

    }

<<<<<<< HEAD
    public ContaCorrente(Integer agencia, Integer numero, Double saldo, Titular titular) {
        super(agencia, numero, saldo, titular);
=======
    public ContaCorrente(Integer agencia, Integer numero, Double saldo) {
        super(agencia, numero, saldo);
>>>>>>> 761bec10dc468237c2d44276bb6c42636f7b45e7
        super.setTaxaDeMovimentacao(TAXA);
    }

    @Override
    public void imprimeDadosConta() {
<<<<<<< HEAD
        System.out.println("****** DADOS CONTA CORRENTE ******");
        super.imprimeDadosConta();
    }
=======
        System.out.println("****** DADOS CONTA CORRENTE ******");        
        super.imprimeDadosConta();
    }

>>>>>>> 761bec10dc468237c2d44276bb6c42636f7b45e7
}