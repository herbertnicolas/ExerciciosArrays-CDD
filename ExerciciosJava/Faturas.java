package ExerciciosJava;
import java.util.ArrayList;
import java.util.Scanner;
/* 
1. Faça um programa que receba o valor das faturas, de
energia, mensais de um cliente, coloque cada uma
delas num array chamado faturas. Após isso, mostre
a média mensal do cliente.
*/

public class Faturas{
    ArrayList<Double> fatura = new ArrayList<Double>();
    double media = 0;

    public void calculaMedia(ArrayList<Double> f){
        for(int i = 0; i < f.size(); i ++){
            media = media + (double)f.get(i);
        }
        System.out.println(media/f.size());
    }

    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        Faturas a = new Faturas();

        System.out.println("Insira o valor da conta:");
        
        while(true){
            double valor = in.nextFloat();

            if(valor == 0){
                a.calculaMedia(a.fatura);
                break;
            }else{
                a.fatura.add(valor);
            }
        }
    }
}