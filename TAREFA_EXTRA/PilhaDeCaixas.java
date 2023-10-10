package TAREFA_EXTRA;
import java.util.ArrayDeque;
import java.util.Deque;



public class PilhaDeCaixas {
   Deque<Caixa> stack;
   private double alturaMax;
public PilhaDeCaixas(Deque<Caixa> stack, double alturaMax) {
    this.stack = new ArrayDeque<Caixa>();
    this.alturaMax = alturaMax;
}
public boolean empilhar(Caixa caixinha){
    double alturaTotal;
    alturaTotal = caixinha.getAltura();
    for (Caixa caixona : stack) {
        alturaTotal = alturaTotal +caixona.getAltura();

   }
   Caixa c=stack.peek();
   if(c instanceof CaixaFragil && ((CaixaFragil)c).getPesoMax() >=caixinha.getPeso()&& this.alturaMax>=alturaTotal){
        stack.push(caixinha);
        return true;
   }

    else if(this.alturaMax>=alturaTotal&& stack.isEmpty()){
        stack.push(caixinha);
        return true;
    }
    else if(this.alturaMax>=alturaTotal&&!(c instanceof CaixaFragil) ){
         stack.push(caixinha);
        return true;
    }
    else{
        return false;
    }
   
}
public Caixa desempilhar(){
    if(this.stack.isEmpty()){
        System.out.println("A pilha está vazia");
        return null;    
    }
    else{
        return this.stack.pop();
    }
}
public double alturaTotal(){
    double alturaTotal = 0;
    for (Caixa caixote : stack) {
        alturaTotal = alturaTotal+caixote.getAltura();
    }
    return alturaTotal;
}
public double pesoTotal(){
    double pesoTotal = 0;
    for (Caixa caixote : stack) {
        pesoTotal = pesoTotal+caixote.getPeso();
    }
    return pesoTotal;
}
public void exibirCaixas(){
    double pesoTotal = 0;
    double alturaTotal = 0;
    for (Caixa barril : stack) {
        barril.exibirEtiqueta();
        System.out.println();
        alturaTotal = alturaTotal+barril.getAltura();
        pesoTotal = pesoTotal +barril.getPeso();
        System.out.println("Peso total: "+pesoTotal);
        System.out.println("Altura total: "+alturaTotal);
        System.out.println();
    }
}
}
