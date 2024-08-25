import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //SCANNER
        Scanner ler = new Scanner(System.in);
        double lado;
        double comprimento;
        double  valorVenda = 3.50;
        double metroQuadrado ;
        double valorTotal;

        System.out.println("Insira o lado do retangulo: ");
        lado = ler.nextDouble();
        System.out.println("Insira o comprimento do retangulo: ");
        comprimento = ler.nextDouble();
        metroQuadrado = lado * comprimento;
        System.out.println("Metros quadrados: " + metroQuadrado);
        System.out.println("Valor por metro quadrado: " + valorVenda);

        //CALCULA O VALOR TOTAL USANDO METROS QUADRADOS
        valorTotal = metroQuadrado * valorVenda;
        System.out.println("Valor total: R$" + valorTotal);



    }
}