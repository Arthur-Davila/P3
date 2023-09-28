package TarefasDeP3;

public class Main {
    public static void main(String[] args) {
        Professor p = new Professor("Almeida", "abcd", 1000000, "Manhã", "Geografia");
        Secretario s = new Secretario("Santos", "cad", 10, "Tarde");
        System.out.println(s.informacoesFuncionario()+"\n");
        System.out.println(p.informacoesFuncionario());
    }
}
