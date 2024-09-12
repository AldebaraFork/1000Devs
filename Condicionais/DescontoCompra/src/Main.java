import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double valorTotalCompra;

        double valorDesconto;

        System.out.println("Insira o valor da compra: ");
        valorTotalCompra = ler.nextDouble();
        if (valorTotalCompra > 100) {

            valorDesconto = valorTotalCompra * 0.10;
            valorTotalCompra = valorTotalCompra - valorDesconto;
            System.out.println("Valor com desconto: " + valorTotalCompra);
        }else {
            System.out.println("Sem desconto! ");
        }
        ler.close();
    }
}