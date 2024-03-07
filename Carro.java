public class Carro {
    private  String modelo;
    private String  marca;
    private  String placa;
    private  String cor;
    private int ano;


    public Carro(String modelo, int ano, String cor, String placa, String marca){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
        this.marca = marca;
    }

    public Carro(){
        this("Kicks",2018,"preto","BEE2114","Nissan");
    }


    public void ligar(){

    }
    public void desligar(){

    }
    public void acelerar(){

    }
    public void frear(){

    }
    public void buzinar(){

    }
}
