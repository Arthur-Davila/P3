package TAREFA7.Questão4;

public class Facebook {
    public static void main(String[] args) {
    

    Post p = new Post("Batata não é pão", "https://github.com/Arthur-Davila/P3");
    int i;
    for(i=0;i<3;i++){
        p.curtir();
    }
    System.out.println("Curtidas: "+p.getNumeroCurtidas());
    for(i=0;i<2;i++){
        p.compartilhar();
    }
    System.out.println("Compartilhamento: "+p.getNumeroCompartilhadas());
}
}