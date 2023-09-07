package TAREFA7.Questão3;

public class Jogo {
    public static void main(String[] args) {
        Lutador jogador1 = new Lutador("Ryu", 100, 10);
        Lutador jogador2 = new Lutador("Bison", 100, 12);
        int i;
        for(i=0;i<3;i++){
            jogador1.aplicarGolpe(jogador2);
        }
        System.out.println(jogador2.getNome()+" \nEnergia: "+jogador2.getEnergia());
        for(i=0;i<8;i++){
            jogador2.aplicarGolpe(jogador1);
        }
        System.out.println(jogador1.getNome()+" \nEnergia: "+jogador1.getEnergia());

    }
}
