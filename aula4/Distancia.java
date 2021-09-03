import java.util.Arrays;
import java.util.Scanner;

/**
 * Considere um array de inteiros, o número de elementos em que é determinado pelo usuário. Os elementos também são tomados como entrada do usuário. Escreva um programa para encontrar o par de elementos que tem a diferença máxima e mínima entre todos os pares de elementos.
 * Exemplo: [3, 12, 5, 8]
 i. Distancia máxima = 3 - 12
 ii. Distancia mínima = 5 - 3
 */

public class Distancia {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do vetor: ");
        int tamanhoArray = sc.nextInt();
        
        int[] arrayInteiros = new int[tamanhoArray];

        for(int i = 0; i < arrayInteiros.length; i++){
            System.out.println("Digite um número: ");
            arrayInteiros[i] = sc.nextInt();
        }
        Arrays.sort(arrayInteiros);
        System.out.println("i. Distância máxima: " + arrayInteiros[0] + " - " + arrayInteiros[arrayInteiros.length - 1]);
        System.out.println("ii. Distância mínima: " + arrayInteiros[1] + " - " + arrayInteiros[0]);
        sc.close();
    }
}
