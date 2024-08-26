import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double queijo = 0.05;
        double  presunto = 0.05;
        double hamburger = 0.120;

        double quantidadeQueijo = 2;
        double quantidadePresunto = 1;
        double quantidadeHamburger = 1;
        int quantidadeSanduiches;



        System.out.print("digite a quantidade de sanduiches: ");
        quantidadeSanduiches = ler.nextInt();
        //Calculo total
        double totalQueijo = queijo * quantidadeQueijo * quantidadeSanduiches;
        double totalPresunto = presunto * quantidadePresunto * quantidadeSanduiches;
        double totalHamburger = hamburger * quantidadeHamburger * quantidadeSanduiches;

        System.out.println("Para produzir " + quantidadeSanduiches + " sanduiches, sao necessarias: ");
        System.out.printf("Total de queijo em kg: = %.2f %n" , totalQueijo );
        System.out.printf("Total de presunto em kg: = %.2f %n" , totalPresunto );
        System.out.printf("Total de hamburger em kg: = %.2f %n" , totalHamburger);


    }
}