package TAREFA7.Questão2;

public class Main2 {
    public static void main(String[] args) {
        Endereco end = new Endereco("José de alencar", 1000,"Apt 301", "Farol", "Macéio", "Alagoas", "33333333");
        Medico med = new Medico("002", "Almeida", 'M', "Bucomaxilar", end);
        System.out.println(med);
        end.setBairro("Arruê");
        end.setCep("0000000000");
        end.setCidade("Nova jersey");
        end.setComplemento("Apt. 1000001");
        end.setUf("tocantis");
        end.setRua("Francisco de moraes");
        end.setNumero(1);
        med.setCodigo("003");
        med.setEndereco(end);
        med.setEspecialidade("Oftamologista");
        med.setNome("Melissa");
        med.setSexo('M');
        System.out.println("\n"+med);


    }    
}
