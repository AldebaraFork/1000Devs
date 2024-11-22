import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;

        System.out.println("Digite 5 numeros: ");
        for (int i = 0; i < 5; i++){
            int numero = ler.nextInt();

            if(numero > 0){
                positivos++;
            }else if(numero < 0){
                negativos++;
            }


        }
        System.out.println("Numeros positivos: " + positivos);
        System.out.println("Numeros negativos: " + negativos);

    }
}