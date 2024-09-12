import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double velocidadeVeiculo;
        double velocidadeMaxima = 120 ;


        System.out.println("Insira a  velocidade do veiculo: ");
        velocidadeVeiculo = ler.nextDouble();
       
        if (velocidadeVeiculo > velocidadeMaxima ) {
            System.out.println("Você excedeu o limite de velocidade! ");
        }else {
            System.out.println("Limite de velocidade permitido!");
        }

    }
}