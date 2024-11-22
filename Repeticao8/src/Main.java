import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int maior = Integer.MAX_VALUE;
        int menor = Integer.MIN_VALUE;


        for(int i = 0; i < 6; i++){
            System.out.print("Digite o " + (i+1) + "º número: ");
            int numero = ler.nextInt();

            if (numero < maior) {
                maior = numero;
            }
            if (numero > menor) {
                menor = numero;
            }

        }
        System.out.println("O menor número é: " + maior);
        System.out.println("O maior numero é : " + menor);
    }
}