import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double pesoPacote;
        double custoFrete;
        double valorProduto;

        System.out.println("Insira o valor do produto: ");
        valorProduto = ler.nextDouble();


        System.out.println("Insira o peso do pacote:");
        pesoPacote = ler.nextDouble();
        if (pesoPacote <= 5) {
            custoFrete = 20;
            valorProduto += custoFrete;
            System.out.println("Custo do frete: " + custoFrete);
            System.out.println("Valor total da compra: " + valorProduto);
        }else if (pesoPacote > 5){
            custoFrete = 50;
            valorProduto += custoFrete;
            System.out.println("Custo do frete: " + custoFrete);
            System.out.println("Valor total da compra: " + valorProduto);
        }else {
            System.out.println("Sem frete! ");
            System.out.println("Valor total da compra: " + valorProduto);
        }
    }
}