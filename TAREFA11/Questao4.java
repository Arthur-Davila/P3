package TAREFA11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int i = 0;
        int[] vet = new int[10];
        int op = -9,op2 = -1;
        while(op!=0){
            System.out.println("Opções");
            System.out.println("1-Colocar valor no vetor");
            System.out.println("2-Mostrar vetor");
            System.out.println("0-Sair");
            op = sc.nextInt();
            switch (op) {
                case 1:
                try{
                    while(op2!=0){
                    
                            System.out.println("Coloque o valor:");
                            vet[i] = sc.nextInt();
                            
                            System.out.println("\nOpções");
                            System.out.println("1-Colocar mais vetor");
                            System.out.println("0-Sair\n");
                            op2 = sc.nextInt();
                            sc.nextLine();
                            i++;
                    }
                }catch ( ArrayIndexOutOfBoundsException e) {
                    System.out.println("\nMais que 10 valores\n");
                    
                }catch(InputMismatchException e){
                    System.out.println("\ndigitado errado\n");
                    sc.nextLine();
                
                }
                    break;
            
                case 2:
                for(i=0;i<vet.length;i++){
                    System.out.println(vet[i]);
                }
                    break;
                case 0:
                break;
            }
        }
    }
}
