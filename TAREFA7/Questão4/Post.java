package TAREFA7.Questão4;

public class Post {
    private String texto;
    private String link;
    private int numeroCurtidas;
    private int numeroCompartilhadas;
    public Post(String texto, String link) {
        this.texto = texto;
        this.link = link;
    }
    public void curtir(){
        this.numeroCurtidas++;
    }
    public void compartilhar(){
        this.numeroCompartilhadas++;
    }
        public int getNumeroCurtidas() {
        return numeroCurtidas;
    }
    public int getNumeroCompartilhadas() {
        return numeroCompartilhadas;
    }

    
}
