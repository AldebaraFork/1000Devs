public class Main {
    public static void main(String[] args) {

        int aa = 30;
        int bb = 10;

        double dinheiro = 450.20;

        boolean estaChovendo = true;
        boolean temPassagem = true;

        //VERIFICAR EXPRESSOES LOGICAS

        if (aa + bb < 40){
            System.out.println("É menor");
        }

        //SEGUNDO EXERCICIO
        if(40 > aa + bb){
            System.out.println("É maior");
        }

        //TERCEIRO EXERCICIO
        if (aa + bb <= 40){
            System.out.println("É menor ou igual");
        }

        //QUARTO EXERCICIO
        if ((aa - 5) == 25){
            System.out.println("É igual a 25");
        }

        //QUINTO EXERCICIO
        if (bb != 16) {
            System.out.println("É diferente de 16 ");
        }

        //SEXTO EXERCICIO
        if (bb != 15){
            System.out.println("é diferente de 15");
        }

        //SETIMO EXERCICIO
        if (aa > 40 && aa < 80){
            System.out.println("Falso");
        }

        //OITAVO EXERCICIO
        if (((aa - bb) * 2) > 60 || ((bb + 2) != 17)){
            System.out.println("falso");
        }

        //NONO EXERCICIO

        if (estaChovendo == true && temPassagem == false && dinheiro <= 380){
            System.out.println("Não há passagem, esta chovendo e estamos pobres");
        }else {
            System.out.println("Podemos viajar");
        }


        //DECIMO EXERCICIO
        if ((aa * 0.10) > (bb * 0.8)){
            System.out.println("10% de aa é menor");
        }else {
            System.out.println("8% de bb é maior");
        }

        //ULTIMO
        if (estaChovendo == false && dinheiro > 1000){
            System.out.println("Podemos viajar, temos dinheiro e não esta chovendo");
        }else {
            System.out.println("Não vai ta dando");
        }
    }
}