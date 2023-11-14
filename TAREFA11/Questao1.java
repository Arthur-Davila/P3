package TAREFA11;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        try{
            System.out.println("Coloque seu nome:");
            String por = sc.nextLine();
            System.out.println("Coloque o numero:");
            int f = sc.nextInt();
            System.out.println(por.charAt(f));
        }
        catch(Exception e){
            System.out.println("Posição inválida");
        }
        sc.close();
    }
}
