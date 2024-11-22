import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String resposta = ler.nextLine();


        do {
            System.out.println("Deseja continuar o laço?");
            resposta = ler.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                System.out.println("acabou o laço");
            }

        }while(resposta.equalsIgnoreCase("s"));
    }
}