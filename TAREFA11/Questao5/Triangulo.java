package TAREFA11.Questao5;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    public Triangulo(double lado1,double lado2,double lado3) throws DimensoesInvalidasException{
        if(Math.abs(lado1-lado2)<lado3&&lado1+lado2>lado3||Math.abs(lado3-lado2)<lado1&&lado3+lado2>lado1||Math.abs(lado1-lado3)<lado2&&lado3+lado1>lado2){
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
            
        }
        else{
            throw new DimensoesInvalidasException("Dimensões inválidas");
        }

    }
    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1) throws DimensoesInvalidasException {
        if(Math.abs(lado1-lado2)<lado3&&lado1+lado2>lado3||Math.abs(lado3-lado2)<lado1&&lado3+lado2>lado1||Math.abs(lado1-lado3)<lado2&&lado3+lado1>lado2){
            this.lado1 = lado1;
          
            
        }
        else{
            throw new DimensoesInvalidasException("Dimensões inválidas");
        }

    }
    public double getLado2() {
        return lado2;
    }
    public void setLado2(double lado2) throws DimensoesInvalidasException {
         if(Math.abs(lado1-lado2)<lado3&&lado1+lado2>lado3||Math.abs(lado3-lado2)<lado1&&lado3+lado2>lado1||Math.abs(lado1-lado3)<lado2&&lado3+lado1>lado2){
      
            this.lado2 = lado2;
      
            
        }
        else{
            throw new DimensoesInvalidasException("Dimensões inválidas");
        }

    }
    public double getLado3() {
        return lado3;
    }
    public void setLado3(double lado3) throws DimensoesInvalidasException {
         if(Math.abs(lado1-lado2)<lado3&&lado1+lado2>lado3||Math.abs(lado3-lado2)<lado1&&lado3+lado2>lado1||Math.abs(lado1-lado3)<lado2&&lado3+lado1>lado2){
         
            this.lado3 = lado3;
            
        }
        else{
            throw new DimensoesInvalidasException("Dimensões inválidas");
        }

    }



}
