package TAREFA7.Questão5;

public class Notas {
    public static void main(String[] args) {
        Aluno alu = new Aluno("Arthur", "000.000.000-01");
        alu.setNota1(10);
        alu.setNota2(7);
        alu.setNota1(8.4);
        alu.setNota4(6);
        double n = alu.calcularMedia();
        System.out.println("Media: "+n);
        alu.setNota2(4);
        n = alu.calcularMedia();
        System.out.println("Media: "+n);
        
    }
}
