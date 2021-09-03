import java.util.Arrays;

/**Pegue um array de 10 elementos, divida-o ao meio, agora imprima o maior elemento de cada parte. */
public class SubArray {
    public static void main(String[] args) {
        int[] arrNumeros = {2,3,55,7,11,12,13,14,11,8};
        
        int[] subArray1 = Arrays.copyOfRange(arrNumeros, 0, 5);
        int[] subArray2 = Arrays.copyOfRange(arrNumeros, 5, arrNumeros.length);

        for (int i : subArray1) {
            System.out.println(i);
        }
        MaxeMin(subArray1);
        for (int i : subArray2) {
            System.out.println(i);
        }
        MaxeMin(subArray2);
    }

    public static void MaxeMin(int arrNumeros[]) {
        int maiorValor = arrNumeros[0];
        int menorValor = arrNumeros[0];

        for (int i = 0; i < arrNumeros.length; i++){
            if (arrNumeros[i] > maiorValor){
                maiorValor = arrNumeros[i];
            } 
            if (arrNumeros[i] < menorValor){
                menorValor = arrNumeros[i];
            }
        }

        System.out.println("Maior = " + maiorValor);
        System.out.println("Menor = " + menorValor);
    }
}
