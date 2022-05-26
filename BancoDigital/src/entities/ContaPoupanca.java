package entities;

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
}