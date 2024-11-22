import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        int numero, somaPares = 0, somaImpares = 0, contPares = 0, contImpares = 0;
        char continuar;

        do {
            System.out.print("Digite um número inteiro (ou qualquer letra para sair): ");
            if (ler.hasNextInt()) {
                numero = ler.nextInt();
                if (numero % 2 == 0) {
                    somaPares += numero;
                    contPares++;
                } else {
                    somaImpares += numero;
                    contImpares++;
                }
            } else {
                break;
            }

            System.out.print("Deseja continuar? (s/n): ");
            continuar = ler.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        if (contPares > 0) {
            double mediaPares = (double) somaPares / contPares;
            System.out.printf("A média dos números pares é: %.2f\n", mediaPares);
        } else {
            System.out.println("Não foram digitados números pares.");
        }

        if (contImpares > 0) {
            double mediaImpares = (double) somaImpares / contImpares;
            System.out.printf("A média dos números ímpares é: %.2f\n", mediaImpares);
        } else {
            System.out.println("Não foram digitados números ímpares.");
        }
    }
}