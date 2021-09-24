import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/**
8) Escreva um programa JAVA que lê três números inteiros do teclado e escreva os
números lidos em ordem decrescente.
 */
public class Ordenar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numerosString[] = sc.nextLine().split(" ");
    
        Integer[] intArray = new Integer[numerosString.length];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(numerosString[i]);
        }

        Arrays.sort(intArray, Collections.reverseOrder());

        for (Integer integer : intArray) {
            System.out.println(integer);
        }
        sc.close();
    }
}
