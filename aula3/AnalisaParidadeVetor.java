/**Faça um algoritmo que recebe ler um array, com 5 elementos e imprime o se esse elemento é ou não par.
 */


 public class AnalisaParidadeVetor {
    public static void main(String[] args) {
        int numeros[] = {5,6,7,8,9};

        for (int i : numeros) {
            if(i%2 == 0){
                System.out.println("Par");
            } else{
                System.out.println("Impar");
            }
        }
    }
}
