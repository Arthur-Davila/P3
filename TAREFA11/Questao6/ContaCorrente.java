package TAREFA11.Questao6;

public class ContaCorrente {
    private int numeroConta;
    private double saldo;
    public ContaCorrente(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public void saque(int nume,double saldo)throws SaldoInsufcienteException{
        if(nume == this.numeroConta){
            if(saldo<=this.saldo){
                this.saldo = this.saldo-saldo;

            }else{
                throw new SaldoInsufcienteException("Saldo Insuficiente");
            }
        }
        else{
            System.out.println("Não possui esse numero da conta.");
        }
    }
}
