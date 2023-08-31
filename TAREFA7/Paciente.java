package TAREFA7;
public class Paciente{
    private String codigo;
    private  String nome;
    private String dataNascimento;
    private char sexo;
    private String planoSaude;
    private String alergia;
    private String tipoSanguineo;
    public Paciente(String codigo, String nome, String dataNascimento, char sexo, String planoSaude, String alergia,
            String tipoSanguineo) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSanguineo;
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
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String getPlanoSaude() {
        return planoSaude;
    }
    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }
    public String getAlergia() {
        return alergia;
    }
    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }
    public String getTipoSanguineo() {
        return tipoSanguineo;
    }
    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
    public String toString(){
        return "Codigo: "+this.codigo+"\nNome: "+this.nome
        +"\nData de Nascimento: "+this.dataNascimento+"\nSexo: "+
        this.sexo+"\nAlergia: "+this.alergia+"\nTipo sanguineo: "+this.tipoSanguineo;
    }
   
    
}