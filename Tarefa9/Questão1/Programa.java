package Tarefa9.Questão1;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
        public static void main(String[] args){
        

        Scanner sc =  new Scanner(System.in);
        String nome;
        double salarioAnual;
        int idade;
        ArrayList<Funcionario> func = new ArrayList<Funcionario>();
        char j = 'n';
        String joia;
        while(j!='s'){
            System.out.println("Coloque o nome do Funcionario:");
             nome = sc.nextLine();
            System.out.println("Coloque o salario anual desse Funcionario:");
             salarioAnual = sc.nextDouble();
            System.out.println("Coloque a idade desse funcionario:");
            idade = sc.nextInt();
            
            Funcionario fun = new Funcionario(nome, salarioAnual, idade);
            func.add(fun);
            System.out.println("Quer Sair?(S/N)");
            joia = sc.next(); sc.nextLine();
            j = joia.charAt(0);
            j = Character.toLowerCase(j);

        }
        for(int i = 0;i<func.size();i++){
            if(func.get(i).getSalarioAnual()>50000&&func.get(i).getIdade()>30){
                System.out.println(func.get(i).getNome());
            }
        }

        }

    }

