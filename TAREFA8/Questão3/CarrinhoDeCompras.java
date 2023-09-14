package TAREFA8.Questão3;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private static ArrayList<String> carrinho;
    private String Usario;
    private String Senha;
        public CarrinhoDeCompras(String usario, String senha) {
        this.Usario = usario;
        this.Senha = senha;
    }


    
    public void adicionar(String item,String senha, String usuario){
        if(this.Senha.compareTo(senha)==0&&this.Usario.compareTo(usuario)==0){
        carrinho.add(item);
        }
        else{
            System.out.println("Usuário Inválido");
        }

    }
    public void remover(String item, String senha,String usuario){
               if(this.Senha.compareTo(senha)==0&&this.Usario.compareTo(usuario)==0){
        int buscar = buscaSequencial(item);
        if(buscar==-1){
            System.out.println("Não tem esse item que quer retirar");
        }
        else{
        carrinho.remove(buscar);
        }
     }
        else{
            System.out.println("Usuário Inválido");
        }
       
    }
    private static int buscaSequencial (String procurado) {
        int i;
        boolean achou = false;
        for (i = 0; i < carrinho.size(); i++) {
        if (carrinho.get(i).compareTo(procurado)==0) {
        achou = true;
        break;
        }
        }
        if (achou == true) {
        return i; // retorna a posição onde encontrou a chave
        }
        else {
        return -1; // retorna -1 indicando que não achou a chave
        }
        }
 

}
