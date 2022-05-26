package application;

import java.util.Scanner;

import entities.ContaCorrente;
import entities.ContaPoupanca;
import entities.Titular;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Titular titular = new Titular();

        System.out.println("**** CADASTRAR CONTA ****");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        titular.setNome(nome);

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        titular.setIdade(idade);

        System.out.print("Endereço: ");
        sc.nextLine();
        String endereco = sc.nextLine();
        titular.setEndereco(endereco);

        ContaCorrente cc = new ContaCorrente(12, 32222, 3000.00, titular);
        ContaPoupanca cp = new ContaPoupanca(12, 43333, 2000.00, titular);

        cc.imprimeDadosConta();
        System.out.println();
        cp.imprimeDadosConta();

        cc.transferir(10.0, cp);

        System.out.println();
        System.out.println("Depois da movimentação!");
        cc.imprimeDadosConta();
        System.out.println();
        cp.imprimeDadosConta();
    }
}
