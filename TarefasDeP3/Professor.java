package TarefasDeP3;

public class Professor extends Funcionario {
     private String disciplina;

    public Professor(String nome, String inscricao, double salario, String turno,String disciplina) {
        super(nome, inscricao, salario, turno);
        this.disciplina = disciplina;

    }
   

    public void lecionar(){

    }
    public void criarAtividades(){

    }


    
    public String informacoesFuncionario() {
        return "Nome:"+ super.getNome()+"\nInscrição: "+super.getInscricao()+"\nSalário: "+super.getSalario()+
        "\nTurno: "+super.getTurno() + "\nDisciplina: "+this.disciplina;
        
    }

}
