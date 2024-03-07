public class Motorista {

    private String nome;
    private String tipoCnh;
    private int avaliacaoM;
    private String email;
    private String senha;
    private String cidade;
    private String tipoCorrida;

    public Motorista(String nome, String tipoCnh,int avaliacaoM,String email, String senha, String cidade, String tipoCorrida){
        this.nome = nome;
        this.tipoCnh = tipoCnh;
        this.avaliacaoM = avaliacaoM;
        this.email = email;
        this.senha = senha;
        this.cidade = cidade;
        this.tipoCorrida = tipoCorrida;
       }

    public Motorista(){
        this("Marcelo","Cnh Ear",5,"marcelo.pereira@gmail.com","ceuazul","Londrina","Entregas");
    }

    public String getNome(){
        return nome;
    }

    public int getAvaliacaoM(){
        return avaliacaoM;
    }

    public String getTipoCorrida(){
        return tipoCorrida;
    }

    public void setAvaliacaoM(int avaliacaoM){
        this.avaliacaoM = avaliacaoM;
    }

    public void aceitarCorrida(){

    }
    public void recusarCorrida(){

    }
    public void denunciarPassageiro(){

    }
    public void avaliarPassageiro(){

    }

}
