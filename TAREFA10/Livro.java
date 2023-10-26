package TAREFA10;

public class Livro extends ItemBiblioteca{
private String autor;



public double calcular_multa(){
    return this.getDias_atrasados()*0.5;
}

public String getAutor() {
    return autor;
}

public void setAutor(String autor) {
    this.autor = autor;
}

public Livro(String Titulo, int Ano, int numeroDeCopias, String autor) {
    super(Titulo, Ano, numeroDeCopias);
    this.autor = autor;
}    
}
