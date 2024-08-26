import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

       double salarioPadrao;
       double salarioFGTS;
       double salarioINSS;
       double impostoTotal;
       double INSS = 0.11;
       double FGTS = 0.08;


       System.out.println("Insira o salario: ");
       salarioPadrao = ler.nextDouble();




       System.out.println("Salario: " + salarioPadrao);
        salarioPadrao = (salarioPadrao * 0.15) + salarioPadrao;
       System.out.println("Salario reajustado : " + salarioPadrao );
       salarioINSS = salarioPadrao * INSS;
        System.out.println("Desconto de 11% do INSS: " + salarioINSS);
        salarioFGTS = salarioPadrao * FGTS;
        System.out.println("Desconto de 8% do FGTS: " + salarioFGTS);


        impostoTotal = salarioINSS + salarioFGTS;
        System.out.printf("Total de desconto INSS+FGTS = %.2f %n" , salarioINSS + salarioFGTS);

        salarioPadrao -= impostoTotal;
        System.out.println("salario final: " + salarioPadrao);

    }
}