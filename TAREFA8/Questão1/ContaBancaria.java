package TAREFA8.Questão1;

public class ContaBancaria {
    private String nomeTitular;
    private int numero;
    private double saldo;

     public ContaBancaria(String nomeTitular, int numero) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
    }
    
    public String getNomeTitular() {
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
}
