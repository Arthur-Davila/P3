package TAREFA11;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        int i,idade;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> vet = new ArrayList<Integer>();
        for(i=0;i<10;i++){
            try{
                System.out.println("Coloque a idade da pessoa " +(i+1)+":");
                idade=sc.nextInt();
                vet.add(idade);

            }
            catch(Exception e){
                System.out.println("Idade invalida");
                sc.nextLine();
                
            }
        }
        try{
            System.out.println("Escolha o valor da lista para remover:");
            vet.remove(sc.nextInt());
        }catch(Exception e){
            System.out.println("posição inválida");
        }
    }
}
