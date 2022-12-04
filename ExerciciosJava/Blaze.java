package ExerciciosJava;
/*
4. Dado um array que tenha 7 posições, representando
os dias da semana, e que na segunda você ganhou
R$220,00, terça você ganhou R$120,00, na quarta
você ganhou R$450,00, na quinta R$650,00, e na
sexta R$300,00, no sábado vc faturou R$1050,00 e no
domingo foi seu dia de folga. coloque esses valores
num array e depois, usando um laço de repetição,
some todos os valores e mostre quanto você ganhou
nesta semana e qual a média diária.
*/
public class Blaze {
    public static void main(String[] args) {
        double[] ganhosSemana = {220,120,450,650,300,1050,0};

        double total = 0;
        for(int i = 0; i < ganhosSemana.length; i++){
            total += ganhosSemana[i];
        }
        System.out.println("Total de ganhos na semana: " + total);
        System.out.println("Media de ganhos por dia: " + total/7);
    }
}
