package TarefasDeP3;

public class Coordenador extends Funcionario {
    

    public Coordenador(String nome, String inscricao, double salario, String turno) {
        super(nome, inscricao, salario, turno);
        
    }
    public void auxiliarProfessores(){

    }
    public void organizarFestivais(){

    }
    @Override
    public String informacoesFuncionario() {
        return "Nome:"+ super.getNome()+"\nInscrição: "+super.getInscricao()+"\nSalário: "+super.getSalario()+
        "\nTurno: "+super.getTurno(); 
    
    }

}
