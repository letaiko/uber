import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Passageiro passageiro1 = new Passageiro("Edna","edna.moda@gmail.com","trovaoazul",998760909);
        Passageiro passageiro2 = new Passageiro();


        Motorista motorista1 = new Motorista("Claudia","Cnh Ear", 4,"claudinha@gmail.com", "solamarelo", "Curitiba", "viagens");
        Motorista motorista2 = new Motorista();

        Carro carro1 = new Carro("Clio",2009,"Cinza","AUU0902","Renault");
        Carro carro2 = new Carro();

        Pagamento pagamento1 = new Pagamento(true,false,false,false,false,89,6);
        Pagamento pagamento2 = new Pagamento();

        System.out.println("CONFIRMAÇÃO DADOS PASSAGEIRO 1");
        System.out.println("Seu nome é: "+passageiro1.getNome());
        System.out.println("Seu celular é: "+passageiro1.getCelular());
        System.out.println(" ");
        System.out.println("ALTERAÇÃO DE DADOS PASSAGEIRO 2");
        System.out.println("Seu antigo nome :"+passageiro2.getNome());
        passageiro2.setNome("Jocacio");
        System.out.println("Seu novo nome é :"+passageiro2.getNome());
        System.out.println(" ");
        System.out.println("VERIFICANDO AVALIAÇÃO DO MOTORISTA 1");
        System.out.println("A avaliação do motorista 1 é "+ motorista1.getAvaliacaoM()+" estrelas");
        System.out.println(" ");
        System.out.println("ALTERAÇÃO DE PREÇO NO PAGAMENTO!!!");
        System.out.println("O antigo valor era: "+pagamento1.getPreco());
        pagamento1.setPreco(57);
        System.out.println("O novo valor está: "+pagamento1.getPreco());










        //Motorista beatriz = new Motorista();

        //Carro carro1 = new Carro(clio, 2006);
       //Carro kicks = new Carro();

        //Pagamento cartao = new Pagamento();
        //Pagamento pix = new Pagamento();


//        clio.modelo = "clio";
//        clio.ano = 2006;
//        clio.cor = "grafiti";
//        clio.placa ="AUU0403";
//        clio.marca = "Renault";

//        kicks.modelo = "kicks";
//        kicks.ano = 2018;
//        kicks.cor = "preto";
//        kicks.placa = "BEE2114";
//        kicks.marca = "Nissan";



//        nicolas.nome = "Nicolas";
//        nicolas.email = "nicolas.machado@gmail.com";
//        nicolas.senha = "32951096N";
//        nicolas.cidade = "Curitiba";
//        nicolas.tipoCnh = "EAR CNH";
//        nicolas.tipoCorrida = "Viagens";
//        nicolas.avaliacaoM = 4;
//
//        beatriz.nome = "Beatriz";
//        beatriz.email = "bea.miranda@gmail.com";
//        beatriz.senha = "olamundo21";
//        beatriz.cidade = "Castro";
//        beatriz.tipoCnh = "EAR CNH";
//        beatriz.tipoCorrida = "Viagens e Entregas";
//        beatriz.avaliacaoM = 5;

//        edna.nome = "edna";
//        edna.email = "ednamota@gmail.com";
//        edna.celular = 962821098;
//        edna.senha = "solazul";
//
//        joca.nome = "joca";
//        joca.email = "jocasilva@gmail.com";
//        joca.celular = 987654321;
//        joca.senha = "raioverde";
//
//        System.out.println("*****CONFIRMAÇÃO DE DADOS*****");
//        System.out.println("Seu nome é "+ edna.nome);
//        System.out.println("Seu e-mail é "+ edna.email);
//        System.out.println("Seu número de celular é "+ edna.celular);
//
//        System.out.println("*****CONFIRMAÇÃO DE DADOS*****");
//        System.out.println("Seu nome é "+ beatriz.nome);
//        System.out.println("Seu e-mail é "+ beatriz.email);
//        System.out.println("Você é de "+ beatriz.cidade);
//        System.out.println();

    }
}
