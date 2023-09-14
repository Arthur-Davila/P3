package TAREFA8.Questão5;

public class Livro {
    private String título;
    private String autor;
    private int anoPublicacao;
    public Livro(String título, String autor, int anoPublicacao) {
        this.título = título;
        this.autor = autor;
        if(anoPublicacao>=0){
        this.anoPublicacao = anoPublicacao;
        }
    }
    public String getTítulo() {
        return título;
    }
    public void setTítulo(String título) {
        this.título = título;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
}
