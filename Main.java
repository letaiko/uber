import java.sql.SQLOutput;


public class Main {
    public static void main(String[] args) {
        Passageiro passageiro1 = new Passageiro("Edna", "edna.moda@gmail.com", "trovaoazul", 998760909, 4.9f);
        Passageiro passageiro2 = new Passageiro("Eduardo", "edu.ardo@gmail.com", "9876alho", 999876523, 5.0f);


        Motorista motorista1 = new Motorista("Claudia", "Cnh Ear", 4.0f, "claudinha@gmail.com", "solamarelo", "Curitiba", "viagens", 992341569);
        Motorista motorista2 = new Motorista("Kecio", "Cnh Ear", 3.9f, "kecio.silva@hotmail.com", "yolanda78", "Maringá", "viagens e entregas", 976543267);

        Carro carro1 = new Carro("Clio", 2009, "Cinza", "AUU0902", "Renault");
        Carro carro2 = new Carro("Kicks", 2018, "preto", "BEE2114", "Nissan");

        Moto moto1 = new Moto("Biz", "vermelho", "Honda", 2014, "PIA45BB");
        Moto moto2 = new Moto("Harley", "Verde", "Harley-Davidson", 2018, "OOI-9876");


        Pagamento pagamento1 = new Pagamento(true, false, false, false, false, 89, 6);
        Pagamento pagamento2 = new Pagamento();

        System.out.println("CONFIRMAÇÃO DADOS PASSAGEIRO 1");
        System.out.println("Seu nome é: " + passageiro1.nome);
        System.out.println("Seu celular é: " + passageiro1.celular);
        System.out.println(" ");
        System.out.println("ALTERAÇÃO DE DADOS PASSAGEIRO 2");
        System.out.println("Seu antigo nome :" + passageiro2.nome);
        passageiro2.setNome("Jocacio");
        System.out.println("Seu novo nome é :" + passageiro2.nome);
        System.out.println(" ");
        System.out.println("VERIFICANDO AVALIAÇÃO DO MOTORISTA 1");
        System.out.println("A avaliação do motorista 1 é " + motorista1.avaliacao + " estrelas");
        System.out.println(" ");
        System.out.println("ALTERAÇÃO DE PREÇO NO PAGAMENTO!!!");
        System.out.println("O antigo valor era: " + pagamento1.getPreco());
        pagamento1.setPreco(57);
        System.out.println("O novo valor está: " + pagamento1.getPreco());

        System.out.println("Características da Moto 1!!!");
        System.out.println("Sua marca é: " + moto1.marca);
        System.out.println("Sua cor é: " + moto1.cor);
        System.out.println("Seu modelo é: " + moto1.modelo);

    }
}









