
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int ano;
        int mes;
        int dia = 0;
        int diaMaximo =0;
        boolean anoBisexto ;


        System.out.println("Informe o ano: ");
        ano = ler.nextInt();
        anoBisexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        System.out.println("Informe o mês: ");
        //Valida o mes
        mes = ler.nextInt();
        if (mes >= 1 && mes <= 12) {
            //usando o switch para facilitar minha vida
            switch (mes) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    diaMaximo = 31;
                    System.out.println("Informe o dia: ");
                    dia = ler.nextInt();
                    if (dia > diaMaximo) {
                        System.out.println("Dia invalido! ");
                    }else {
                        System.out.println("Data atual: " + dia + "/" + mes + "/" + ano);
                    }
                    break;

                case 4: case 6: case 9: case 11:
                    diaMaximo = 30;
                    System.out.println("Informe o dia: ");
                    dia = ler.nextInt();
                    if (dia > diaMaximo) {
                        System.out.println("Dia invalido! ");
                    }else {
                        System.out.println("Data atual: " + dia + "/" + mes + "/" + ano);
                    }
                    break;
                case 2:
                    if (anoBisexto) {
                        diaMaximo = 29;
                        System.out.println("Informe o dia: ");
                        dia = ler.nextInt();
                        if (dia > diaMaximo) {
                            System.out.println("Dia invalido! ");
                        }else {
                            System.out.println("Data atual: " + dia + "/" + mes + "/" + ano);
                        }
                    } else {
                        diaMaximo = 29;
                        System.out.println("Informe o dia: ");
                        if (dia > diaMaximo) {
                            System.out.println("Dia invalido! ");
                        }else {
                            System.out.println("Data atual: " + dia + "/" + mes + "/" + ano);
                        }
                    }
            }
        }else {
            System.out.println("Mes invalido! Tente novamente");

        }


    }
}