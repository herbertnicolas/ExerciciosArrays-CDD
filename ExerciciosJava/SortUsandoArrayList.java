package ExerciciosJava;
import java.util.ArrayList;
import java.util.Collections;

//mesmo exercicio, só que utilizando ArrayList e Collections pra acessar o metodo de ordenaçao (Collections.sort(ArrayList))
public class SortUsandoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> novoArray = new ArrayList<Integer>();

        int[] primeiroArray = { 32, 25, 50, 10, 16, 30 };
        int[] segundoArray = { 8, 2, 9, 11, 15, 20, 45 };

        for(int i = 0; i < 7; i++){
            if(i != 6){             //gambiarrinha pra nao acessar a ultima posiçao do array, já que o ultimo index do primeiroArray é [5]
                novoArray.add(primeiroArray[i]);        
                novoArray.add(segundoArray[i]);     //adicionando os dois de uma vez na lista novoArray (a ordem nao importa aqui, pois tudo vai ser ordenado na linha 21)
            }else{
                continue;
            }
        }
        Collections.sort(novoArray);    //ordenando
        System.out.println(novoArray);  //printando a lista
    }
}
