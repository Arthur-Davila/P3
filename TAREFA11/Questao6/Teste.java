package TAREFA11.Questao6;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws SaldoInsufcienteException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque o numero da Conta:");
        int conta = sc.nextInt();
        System.out.println("Coloque o saldo da Conta:");
        double saldo = sc.nextDouble();
        ContaCorrente c  = new ContaCorrente(conta, saldo);
        Double[] saquear = new Double[10];
        int i;
        for(i = 0;i<10;i++){
            System.out.println("Coloque o valor que quer o saque "+(i+1));
            saquear[i] = sc.nextDouble();
        }
        for(i=0;i<10;i++){
            c.saque(conta, saquear[i]);
        }
    
    }
}
