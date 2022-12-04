package ExerciciosJava;
import java.util.Scanner;

/*
2. Faça um programa que guarde, num array, a
quantidade de Km rodados por um motorista de
caminhão, diariamente, sabendo que ele viajou 14
dias. Solicite este valor do motorista, que deve digitar
no teclado os valores rodados por dia. após isso deve
ser calculado a média da primeira semana e a média
da segunda semana, bem com a média dos 14 dias.
*/

public class Hodometro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] kmDiario = new double[14];
        
        for(int i = 0; i < 14; i++){
            double rodado = in.nextDouble();     
            kmDiario[i] = rodado;
        }

        double media = 0; double res = 0;
        for(int i = 0; i < 7; i++){
            media += kmDiario[i];
            res = media/7;
        }
        System.out.println("Media de KMs rodados na primeira semana foi: " + res);
        
        media = 0; res = 0;
        for(int i = 6; i < 14; i++){
            media += kmDiario[i];
            res = media/7;
        }
        System.out.println("Media de KMS rodados na segunda semana foi: " + res);

        media = 0; res = 0;
        for(int i = 0; i < 14; i++){
            media += kmDiario[i];
            res = media/14;
        }
        System.out.println("Media de KMS rodados nas duas semanas foi: " + res);
    }
}
