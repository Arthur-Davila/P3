package TAREFA7.Questão3;

public class Lutador {
    private String nome;
    private int energia;
    private int forca;
    public Lutador(String nome, int energia, int forca) {
        this.nome = nome;
        this.energia = energia;
        this.forca = forca;
    }
    public void reduzirEnergia(){
        //não sei o que é pra fazer aqui
        this.energia = this.energia-this.forca;
    }
    public void aplicarGolpe(Lutador lut1){
        lut1.energia = lut1.energia-this.forca;

    }
    public String getNome() {
        return nome;
    }
    public int getEnergia() {
        return energia;
    }
    public int getForca() {
        return forca;
    }
    
}
