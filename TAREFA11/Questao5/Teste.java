package TAREFA11.Questao5;

import java.util.Scanner;

public class Teste{
    public static void main(String[] args) throws DimensoesInvalidasException {
        Triangulo t = new Triangulo(3, 4, 5);
        Scanner sc = new Scanner(System.in);
        t.setLado1(10);
        double lad1,lad2,lad3;
        System.out.println("Coloque o primeiro lado do triangulo:");
        lad1 = sc.nextDouble();
        System.out.println("Coloque o segundo lado do triangulo:");
        lad2 = sc.nextDouble();
        System.out.println("Coloque o terceiro lado do triangulo:");
        lad3 = sc.nextDouble();
        Triangulo f = new Triangulo(lad1, lad2, lad3);
        sc.close();
    }
}
