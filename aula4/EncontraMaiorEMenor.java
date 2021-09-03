/**Encontre o maior e o menor elementos de uma array de 1 dimensão. */
public class EncontraMaiorEMenor {
    public static void main(String[] args) {
        int[] arrNumeros = {2,3,55,7,11};
        int maiorValor = arrNumeros[0];
        int menorValor = arrNumeros[0];

        for (int i = 0; i < arrNumeros.length; i++){
            
            //maiorValor = arrNumeros[i] > maiorValor ? arrNumeros[i] : arrNumeros[i];
            if (arrNumeros[i] > maiorValor){
                maiorValor = arrNumeros[i];
            } 
            //menorValor = arrNumeros[i] < menorValor ? arrNumeros[i] : arrNumeros[i];
            if (arrNumeros[i] < menorValor){
                menorValor = arrNumeros[i];
            }
        }

        System.out.println("Maior = " + maiorValor);
        System.out.println("Menor = " + menorValor);
    }
}
