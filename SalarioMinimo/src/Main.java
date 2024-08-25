import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double salarioMinimo = 1400;
        double salarioFuncionario;
        double calcularSalario;

        System.out.println("Insira o salario:");
        salarioFuncionario = ler.nextDouble();
        if (salarioFuncionario < salarioMinimo) {
            System.out.println("Não recebe nenhum salario minimo!");
        }else if (salarioFuncionario == salarioMinimo) {
            System.out.println("Recebe 1 salario minimo ");
        }else{
            calcularSalario = salarioFuncionario / salarioMinimo;
            System.out.printf("Quantidade de salarios minimos = %.2f %n" , calcularSalario);

        }

    }
}