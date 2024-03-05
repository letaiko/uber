import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Passageiro edna = new Passageiro();
        Passageiro joca = new Passageiro();

        Motorista nicolas = new Motorista();
        Motorista beatriz = new Motorista();

        Carro clio = new Carro();
        Carro kicks = new Carro();

        Pagamento cartao = new Pagamento();
        Pagamento pix = new Pagamento();


        clio.modelo = "clio";
        clio.ano = 2006;
        clio.cor = "grafiti";
        clio.placa ="AUU0403";
        clio.marca = "Renault";

        kicks.modelo = "kicks";
        kicks.ano = 2018;
        kicks.cor = "preto";
        kicks.placa = "BEE2114";
        kicks.marca = "Nissan";



        nicolas.nome = "Nicolas";
        nicolas.email = "nicolas.machado@gmail.com";
        nicolas.senha = "32951096N";
        nicolas.cidade = "Curitiba";
        nicolas.tipoCnh = "EAR CNH";
        nicolas.tipoCorrida = "Viagens";
        nicolas.avaliacaoM = 4;

        beatriz.nome = "Beatriz";
        beatriz.email = "bea.miranda@gmail.com";
        beatriz.senha = "olamundo21";
        beatriz.cidade = "Castro";
        beatriz.tipoCnh = "EAR CNH";
        beatriz.tipoCorrida = "Viagens e Entregas";
        beatriz.avaliacaoM = 5;

        edna.nome = "edna";
        edna.email = "ednamota@gmail.com";
        edna.celular = 962821098;
        edna.senha = "solazul";

        joca.nome = "joca";
        joca.email = "jocasilva@gmail.com";
        joca.celular = 987654321;
        joca.senha = "raioverde";

        System.out.println("*****CONFIRMAÇÃO DE DADOS*****");
        System.out.println("Seu nome é "+ edna.nome);
        System.out.println("Seu e-mail é "+ edna.email);
        System.out.println("Seu número de celular é "+ edna.celular);

        System.out.println("*****CONFIRMAÇÃO DE DADOS*****");
        System.out.println("Seu nome é "+ beatriz.nome);
        System.out.println("Seu e-mail é "+ beatriz.email);
        System.out.println("Você é de "+ be);


    }
}