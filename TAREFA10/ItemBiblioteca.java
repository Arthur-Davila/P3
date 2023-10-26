package TAREFA10;

public class ItemBiblioteca {
    private String Titulo;
    private int Ano;
    private int numeroDeCopias;
    private int dias_atrasados;
    
    public ItemBiblioteca(String Titulo, int Ano, int numeroDeCopias) {
        this.Titulo = Titulo;
        this.Ano = Ano;
        this.numeroDeCopias = numeroDeCopias;
    }
       public ItemBiblioteca(String Titulo, int Ano, int numeroDeCopias,int dias_atrasados) {
        this.Titulo = Titulo;
        this.Ano = Ano;
        this.numeroDeCopias = numeroDeCopias;
        this.dias_atrasados = dias_atrasados;
    }
 
    public double calcular_multa(){
        return this.dias_atrasados*0.5;
    }
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public int getAno() {
        return Ano;
    }
    public void setAno(int ano) {
        Ano = ano;
    }
    public int getNumeroDeCopias() {
        return numeroDeCopias;
    }
    public void setNumeroDeCopias(int numeroDeCopias) {
        this.numeroDeCopias = numeroDeCopias;
    }
    public int getDias_atrasados() {
        return dias_atrasados;
    }
    public void setDias_atrasados(int dias_atrasados) {
        this.dias_atrasados = dias_atrasados;
    }
}