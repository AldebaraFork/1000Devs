import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);


        double a,b,c;
        double pi = 3.14159;
        double areaTrianguloRetangulo;
        double areaCirculo;
        double areaTrapezio;
        double areaQuadrado;
        double areaRetangulo;



        //obtem os valores
        //System.out.println("Insira o valor de A:" );
        a = ler.nextDouble();
        //System.out.println("Insira o valor de B: ");
        b = ler.nextDouble();
        //System.out.println("Insira o valor de C: ");
        c = ler.nextDouble();

        //atribuição
        areaTrianguloRetangulo = (a * c) /2;
        areaCirculo = pi * c * c;
        areaTrapezio = ((a + b) * c) / 2;
        areaQuadrado = b * b;
        areaRetangulo = a * b;

        //exibe
        System.out.printf("TRIANGULO: %.3f%n" , areaTrianguloRetangulo );
        System.out.printf("CIRCULO:  %.3f%n" , areaCirculo );
        System.out.printf("TRAPEZIO: %.3f%n" , areaTrapezio );
        System.out.printf("QUADRADO: %.3f%n" , areaQuadrado );
        System.out.printf("RETANGULO %.3f%n" , areaRetangulo );




    }
}