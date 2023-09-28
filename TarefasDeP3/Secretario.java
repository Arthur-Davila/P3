package TarefasDeP3;

public class Secretario extends Funcionario{
    public Secretario(String nome, String inscricao, double salario, String turno) {
        super(nome, inscricao, salario, turno);
        
    }
    public void receberEncomendas(){

    }
    public void receberPagamentos(){

    }
    @Override
    public String informacoesFuncionario() {
        
          return "Nome:"+ super.getNome()+"\nInscrição: "+super.getInscricao()+"\nSalário: "+super.getSalario()+
        "\nTurno: "+super.getTurno(); 
    }
}
