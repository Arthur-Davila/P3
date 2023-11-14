package TAREFA10;

public class Revista extends ItemBiblioteca{
    private String edicao;



    public double calcular_multa(){
    return this.getDias_atrasados()*0.3;
}
    public String getEdicao() {
        return edicao;
    }
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    public Revista(String Titulo, int Ano, int numeroDeCopias, String edicao) {
        super(Titulo, Ano, numeroDeCopias);
        this.edicao = edicao;
    }
    
}
