/** Inicialize e imprima todos os elementos de um array 2D.*/
public class ImprimeArray2D {
    public static void main(String[] args) {
        int[][] matriz = new int[3][2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = j + i;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][0] + " " + matriz[i][1]);
        }
    }
}
