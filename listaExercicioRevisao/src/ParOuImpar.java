import java.util.Scanner;
/**
5) Crie um programa JAVA que leia um numero de teclado e informe se o numero
é par ou impar
 */
public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if(numero%2 == 0){
            System.out.println("Par");
        } else{
            System.out.println("Impar");
        }
        sc.close();
    }
}
