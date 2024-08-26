import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int quantidadeFrangos;
        double precoChipId = 4.0;
        double precoAlimentacao = 3.5;
        double peEsquerdo = 2;
        double peDireito = 1;
        double totalPeEsquerdo;
        double totalPeDireito;
        double valorTotalFrangos;



        System.out.print("Insira a quantidade de frangos: ");
        quantidadeFrangos = ler.nextInt();
        totalPeDireito = quantidadeFrangos * precoChipId;
        totalPeEsquerdo = peEsquerdo * precoAlimentacao * quantidadeFrangos;
        valorTotalFrangos = totalPeEsquerdo + totalPeDireito;
        System.out.println("valor total para identifica os frangos: " + valorTotalFrangos);

    }
}