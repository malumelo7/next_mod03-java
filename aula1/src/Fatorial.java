import java.util.Scanner;
/*
• Crie uma classe chamada Fatorial e mande criar o método main.
• No método main implemente um programa que lê um número do teclado e em seguida imprime seu fatorial. (procure implementar isso utilizando alguma estrutura de laço)
 */
public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultadoFatorial = 1;
        
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int valorInicial = num;

        while(num > 0){
            if (num == 1){
                break;
            }
            resultadoFatorial = resultadoFatorial*num;
            num--;
        }

        System.out.println("O resultado do fatorial de " + valorInicial + " é: " + resultadoFatorial);
        sc.close();
    }
    
}