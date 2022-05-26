package application;

import entities.ContaCorrente;
import entities.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
           // Scanner sc = new Scanner(System.in);
           ContaCorrente cc = new ContaCorrente(12, 32222, 3.000);
           ContaPoupanca cp = new ContaPoupanca(12, 43333, 2.000); 
   
           
           cc.imprimeDadosConta();
           cp.imprimeDadosConta();
    }
}
