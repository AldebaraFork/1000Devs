import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int idade = 0;

        System.out.println("Insira a idade: ");
        idade = ler.nextInt();
        if (idade < 18 ){
            System.out.println("Não é possivel tirar a habilitação!");
        }else {
            System.out.println("Você pode a habilitação");
        }
    }
}