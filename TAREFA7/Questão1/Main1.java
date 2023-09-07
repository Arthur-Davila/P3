package TAREFA7.Questão1;


public class Main1 {
    public static void main(String[] args) {
        Paciente p = new Paciente("0000","Arthur","31/08/2002",'M',"Amil","Poeira","O+");
        System.out.println(p);
        p.setNome("Ricardo");
        p.setDataNascimento("01/11/1963");
        p.setSexo('M');
        p.setAlergia("Polen");
        p.setCodigo("0001");
        p.setPlanoSaude("Unimed");
        p.setTipoSanguineo("O+");
        System.out.println("\n"+p);

    }
}
