import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
       
        int quantidadeCavalos;
        double valorFerradura ;
        int quantidadeFerraduras;

        //OBTEM O VALOR DAS FERRADURAS E A QUANTIDADE DE CAVALOS
        System.out.println("Insira a quantidade de cavalos: ");
        quantidadeCavalos = ler.nextInt();
        System.out.println("Insira o valor da ferradura: ");
        valorFerradura = ler.nextDouble();

        quantidadeFerraduras = quantidadeCavalos * 4;
        System.out.println("quantidade de ferraduras necessarias: " + quantidadeFerraduras);
        valorFerradura = quantidadeCavalos * valorFerradura;
        System.out.println("valor total para a compra das ferraduras: "  + valorFerradura);

    }
}