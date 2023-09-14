package TAREFA8.Questão2;

public class Carro {
    private String marca;
    private String modelo;
    private int anoDeFab;
    private double velocidade;
   
    public Carro(String marca, String modelo, int anoDeFab, double velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFab = anoDeFab;
        if(velocidade >=0){
        this.velocidade = velocidade;
        }
    }
    public void acelerar(){
        this.velocidade++;
    }
    public void desacelerar(){
        if(this.velocidade>0){
            this.velocidade++;
        }
    }
    
}
