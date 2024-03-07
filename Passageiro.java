public class Passageiro {
    private String nome;
    private String email;
    private String senha;
    private int celular;

    public Passageiro(String nome, String email, String senha, int celular){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.celular = celular;
    }

    public Passageiro(){
        this("Joca","joca.silva","jo2345",976554323);
    }

    public String getNome(){
        return nome;
    }

    public int getCelular(){
        return celular;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    public void chamarCorrida(){

    }
    public void escolherCategoria(){

    }

    public void denunciarMotorista(){

    }
    public void avaliarMotorista(){

    }
}
