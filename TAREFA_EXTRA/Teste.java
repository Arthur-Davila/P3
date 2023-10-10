package TAREFA_EXTRA;

public class Teste {
    public static void main(String[] args) {
        PilhaDeCaixas p = new PilhaDeCaixas(null, 40);
        Caixa c = new Caixa("1", "Nutella", 10, 10);
        Caixa t = new Caixa("2", "MANGA", 19, 20);
        CaixaFragil f = new CaixaFragil("3", "mendoim", 11, 11, 10);
        Caixa g = new Caixa("4","oito", 0, 70);
        Caixa l = new Caixa("5", "machado", 11, 11);
        Caixa o = new Caixa("6", "bacate", 1, 10);
        p.empilhar(c);
        p.empilhar(t);
        p.empilhar(f);
        p.empilhar(g);
        p.empilhar(l);
        p.empilhar(o);
        p.desempilhar();
        p.exibirCaixas();
    }
}
