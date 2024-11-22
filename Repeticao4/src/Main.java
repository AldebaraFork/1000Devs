import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String resposta = ler.nextLine();
        while(resposta.equals("s")){
            resposta = ler.nextLine();
            System.out.println("laço continua");
            if (resposta.equals("n")){
                System.out.println("acabou o laço");
            }
        }

    }
}