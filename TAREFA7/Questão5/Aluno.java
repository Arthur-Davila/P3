package TAREFA7.Questão5;

public class Aluno {
    private String nome;
    private String cpf;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public double calcularMedia(){
        return ((this.nota1+this.nota2+this.nota3+this.nota4)/4);
    }
   
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }
    
    
}
