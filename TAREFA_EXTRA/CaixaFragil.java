package TAREFA_EXTRA;
public class CaixaFragil extends Caixa{
private double pesoMax;
    public CaixaFragil(String identificador, String conteudo, double peso, double altura,double pesoMax) {
        super(identificador, conteudo, peso, altura);
       if(pesoMax>=0){
        this.pesoMax = pesoMax;
    }
}
    public double getPesoMax() {
        return pesoMax;
    }
    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }
    public void exibirEtiqueta(){
        System.out.println("Identificador: "+getIdentificador()+"\nConteúdo: "+getConteudo()+"\nPeso: "+getPeso()+"\nAltura: "+getAltura()+"\nPeso Maxímo: "+this.pesoMax);
    }
}