package TAREFA10;

public class DVD extends ItemBiblioteca{
    private int duration;

    public double calcular_multa(){
        return this.getDias_atrasados()*0.6;
    }

    public DVD(String Titulo, int Ano, int numeroDeCopias, int duration) {
        super(Titulo, Ano, numeroDeCopias);
        this.duration = duration;

    }

 
}
