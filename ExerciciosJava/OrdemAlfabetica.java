package ExerciciosJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/*
6. Dado o array ArrayString = {"tres","um","cinco","dez","vinte","quinze"};
imprima ele em ordem alfabética.
 */
public class OrdemAlfabetica {
    public static void main(String[] args) {
        ArrayList<String> arrayString = new ArrayList<String>(Arrays.asList(new String[]{"tres","um","cinco","dez","vinte","quinze"})); //inicializando o arraylist com os elementos
        Collections.sort(arrayString);
        System.out.println(arrayString);
    }    
}
