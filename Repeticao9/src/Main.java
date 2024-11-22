import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num, intervalo1 = 0, intervalo2 = 0, intervalo3 = 0, intervalo4 = 0;

        System.out.println("Digite os números (número negativo para parar):");

        while (true) {
            num = ler.nextInt();

            if (num < 0) {
                break;
            } else if (num <= 25) {
                intervalo1++;
            } else if (num <= 50) {
                intervalo2++;
            } else if (num <= 75) {
                intervalo3++;
            } else {
                intervalo4++;
            }
        }

        System.out.println("Quantidade de números no intervalo de 0 a 25: " + intervalo1);
        System.out.println("Quantidade de números no intervalo de 26 a 50: " + intervalo2);
        System.out.println("Quantidade de números no intervalo de 51 a 75: " + intervalo3);
        System.out.println("Quantidade de números no intervalo de 76 a 100: " + intervalo4);
    }
}