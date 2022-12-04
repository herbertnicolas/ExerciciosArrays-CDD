package ExerciciosJava;

/*
5. PrimeiroArray = {32, 25, 50, 10, 16, 30 },
SegundoArray = {8, 2, 9, 11, 15, 20, 45 }
Crie um novo array que receba o conteúdo desses 2
arrays e após isso coloque os itens em ordem crescente.
*/
public class SortUsandoArray {
    public static void main(String[] args) {
        int[] primeiroArray = { 32, 25, 50, 10, 16, 30 };
        int[] segundoArray = { 8, 2, 9, 11, 15, 20, 45 };

        int[] novoArray = new int[13];

        for (int i = 0; i < 7; i++) {
            if (i != 6) {
                novoArray[i] = primeiroArray[i];
            }
            novoArray[i + primeiroArray.length] = segundoArray[i];
        }

        // implementando abaixo um "metodo" pra fazer sort. ( isso é equivalente ao Collections.sort(ArrayList a), mas como to usando array, tenho que implementar meu proprio sort )
        int aux = 0;
        for (int i = 0; i < 12; i++) {                          //nao preciso percorrer a ultima posiçao, pq... 
            for (int j = 0; j < 12; j++) {                      //...o maior elemento vai ser jogado pra ultima posiçao naturalmente
                if (novoArray[j] < novoArray[j + 1]) {
                    novoArray[j] = novoArray[j];
                } else {
                    aux = novoArray[j];                         //variavel aux pra nao perder o novoArray[j]
                    novoArray[j] = novoArray[j + 1];            //se nao tivesse o aux, novoArray[j] ia ser substituido aqui e ia dar ruim na ordem
                    novoArray[j + 1] = aux;                     //novoArray[j+1] recebendo novoArray[j] antigo               
                }
            }
        }

        for (int item : novoArray) {
            System.out.print(item + " ");
        }
    }
}
