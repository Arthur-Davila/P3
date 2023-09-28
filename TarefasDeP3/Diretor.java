package TarefasDeP3;

public class Diretor extends Funcionario {
    private String segTurno;
   
    public Diretor(String nome, String inscricao, double salario, String turno,String segTurno) {
        super(nome, inscricao, salario, turno);
        this.segTurno = segTurno;
    }
    public void criarDesconto(){

    }
    public void encomendarFardas(){

    }
    public void gerenciarProfessores(){
        
    }
    public String getSegturno() {
        return segTurno;
    }
    public void setSegturno(String segturno) {
        this.segTurno = segturno;
    }
    @Override
    public String informacoesFuncionario() {
      
        return "Nome:"+ super.getNome()+"\nInscrição: "+super.getInscricao()+"\nSalário: "+super.getSalario()+
        "\nTurno: "+super.getTurno() + "\nSegundo Turno: "+this.segTurno;
            
        
    }
   
    
}
