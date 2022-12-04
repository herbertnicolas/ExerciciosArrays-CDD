package ExerciciosJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
7. Dado o array listaArray = {10, 20, 30, 40, 45, 50, 32},
faça um programa que solicite um numero do usuário
e verifique se este número está dentro do array.
 */

public class HasNumber {
    static ArrayList<Integer> listaArray;

    public void temNumero(ArrayList lista, int entrada) { 
        if(lista.contains(entrada)) System.out.println("O número está no array.");
        else System.out.println("Ops... O numero não está no array.");                                              
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HasNumber h = new HasNumber();
        h.listaArray = new ArrayList<Integer>(Arrays.asList(new Integer[] { 10, 20, 30, 40, 45, 50, 32 }));
        int entrada = in.nextInt();
        h.temNumero(h.listaArray, entrada);
        }
}
