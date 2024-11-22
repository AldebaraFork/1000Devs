import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double somaSalarios = 0, somaFilhos = 0;
        double maiorSalario = Double.MIN_VALUE;
        int numHabitantes = 0, numSalariosAte1000 = 0;
        char continuar;

        do {
            System.out.print("Digite o salário: R$ ");
            double salario = ler.nextDouble();
            System.out.print("Digite o número de filhos: ");
            int numFilhos = ler.nextInt();

            somaSalarios += salario;
            somaFilhos += numFilhos;
            maiorSalario = Math.max(maiorSalario, salario);

            if (salario <= 1000) {
                numSalariosAte1000++;
            }

            numHabitantes++;

            System.out.print("Deseja continuar? (s/n): ");
            continuar = ler.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        double mediaSalarios = somaSalarios / numHabitantes;
        double mediaFilhos = somaFilhos / numHabitantes;
        double percentualSalariosAte1000 = (double) numSalariosAte1000 / numHabitantes * 100;

        System.out.println("\nResultados da pesquisa:");
        System.out.printf("Média salarial: R$ %.2f\n", mediaSalarios);
        System.out.printf("Média de filhos: %.2f\n", mediaFilhos);
        System.out.printf("Maior salário: R$ %.2f\n", maiorSalario);
        System.out.printf("Percentual de pessoas com salário até R$ 1000,00: %.2f%%\n", percentualSalariosAte1000);
    }
}