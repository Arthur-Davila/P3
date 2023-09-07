package TAREFA7.Questão2;

public class Medico {
    private String codigo;
    private String nome;
    private char sexo;
    private String especialidade;
    private Endereco endereco;
    public Medico(String codigo, String nome, char sexo, String especialidade, Endereco endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }
    @Override
    public String toString() {
        return "codigo: " + codigo + "\nnome: " + nome + "\nsexo: " + sexo + "\nespecialidade: " + especialidade
                + "\n"+ endereco;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
}
