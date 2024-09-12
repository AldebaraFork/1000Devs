import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double temperatura;

        System.out.println("Informe a temperatura: ");
        temperatura = ler.nextDouble();
        if (temperatura > 38){
            System.out.println("Você está com febre! ");
        }else {
            System.out.println("Você não está com febre! ");
        }
    }
}