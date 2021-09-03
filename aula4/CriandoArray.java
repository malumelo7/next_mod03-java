/**
 * Pegue um array com 10 inteiros e copie todos os elementos em um novo array, mas na ordem inversa.
 */
public class CriandoArray {
    public static void main(String[] args) {
        int[] arrInteiros = {2,3,5,7,11,13,17,23,27,11};
        int[] arrInteirosInverso = new int[10];
    
        for (int i = arrInteiros.length - 1; i >= 0; i--){
            int posicao = arrInteiros.length - i - 1;
            arrInteirosInverso[posicao] = arrInteiros[i];
        }

        for (int i : arrInteirosInverso) {
            System.out.println(i);
        }
    }
}