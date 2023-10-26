package TAREFA10;

import java.util.Scanner;


public class Usuario {
    
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    System.out.println("Digite um titulo: ");
    String titulo = scanner.nextLine();
    System.out.println("Digite o ano de publicação: ");
    int ano = scanner.nextInt();
    System.out.println("Digite o numero de copias: ");
    int copias = scanner.nextInt();
    System.out.println();
    System.out.println("1-Livro");
    System.out.println("2-DVD");
    System.out.println("3-Revista");
    System.out.println("Digite o valor do item:");
    int value = scanner.nextInt();
    switch (value) {
        case 1:
     
    System.out.println("Digite o nome do autor: ");
    String autor = scanner.nextLine();       
    Livro l = new Livro(titulo, ano,copias,autor);      
    l.calcular_multa();    
    break;
            case 2:
System.out.println("Digite a duração:");
    int dura = scanner.nextInt();
    DVD d = new DVD(titulo, ano, copias, dura);
    d.calcular_multa();
        break;
        case 3:
          
    System.out.println("Digite o nome do edição: ");
    String edicao = scanner.nextLine();
    Revista r = new Revista(titulo, ano, copias, edicao);
    r.calcular_multa();
    break;
        default:
            break;
    }
        
}

    public void emprestimo(ItemBiblioteca b){
        System.out.println("Emprestado com sucesso!");
        b.setNumeroDeCopias(b.getNumeroDeCopias()-1);
    
    }
    public void retorno(ItemBiblioteca p){
        System.out.println("Digite os dias atrasados");
        int dias_atrasados = scanner.nextInt();
        ItemBiblioteca f = new ItemBiblioteca(p.getTitulo(), p.getAno(), p.getNumeroDeCopias(),dias_atrasados);
        double mult = f.calcular_multa();
        System.out.println(mult);
    }
}
