package ExerciciosJava;
/*
Sabendo que o consumo de um veículo é de 8km por
litro, e sabendo que um motorista rodou no primeiro
dia 105km, no segundo dia 200km, no terceiro dia
55km, no quarto dia rodou 170km e no quinto dia
rodou 95km. Faça um programa que guarde esses
valores num array e depois, lendo o array, mostre a
média diária de km rodados e de consumo por dia.
mostre também o total de combustivel consumido.
 */
public class Combustivel {
    public static void main(String[] args) {
        int[] kmDia = {105,200,55,170,95};
        
        double litrosDia = 0;
        int total = 0;
        for(int i = 0; i < kmDia.length; i++){
            total += kmDia[i];
            litrosDia += kmDia[i]/8;     //no fim vai armazenar litros dos cinco dias
        }

        System.out.println("A média diária de KMs rodados é de: " + total/5);
        System.out.println("Foram consumidos: " + litrosDia + " litros de combustível.");
        System.out.println("A média de consumo de combustível por dia é de: " + litrosDia/5);

    }
}
