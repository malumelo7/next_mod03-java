import java.util.Scanner;

/*
• Crie uma classe chamada Fatorial e mande criar o método main.
• No método main implemente um programa que lê um número do teclado e em seguida imprime seu fatorial.
 */
public class FatorialUsandoRecursao {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int resultadoFatorial = fatorial(num);
        System.out.println("O resultado do fatorial de " + num + " é: " + resultadoFatorial);
        sc.close();
    }

    public static int fatorial(int num){
        if (num == 0){
            return 1;
        }
        return fatorial(num - 1)*num;
    }
    
}