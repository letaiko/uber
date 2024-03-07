public class Pagamento {
    public boolean metodoSaldo;
    public boolean metodoCartao;
    public boolean metodoDinheiro;
    public boolean metodoBoleto;
    public boolean metodoPix;
    public float preco;
    public float gorjeta;

    public Pagamento(boolean metodoSaldo, boolean metodoCartao, boolean metodoDinheiro, boolean metodoBoleto, boolean metodoPix,float preco, float gorejta ){
        this.metodoSaldo = metodoSaldo;
        this.metodoCartao = metodoCartao;
        this.metodoDinheiro = metodoDinheiro;
        this.metodoBoleto = metodoBoleto;
        this.metodoPix = metodoPix;
        this.preco = preco;
        this.gorjeta = gorjeta;

    }

    public void selecionarMetodo(){

    }
