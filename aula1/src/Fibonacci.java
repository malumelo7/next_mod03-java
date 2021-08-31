import java.util.Scanner;
/*
• A seqüência de Fibonacci possui como primeiro e segundo elementos o número 1. A partir de então, os próximos números são o resultado da soma dos dois números
anteriores.
• Ex: 1, 1, 2, 3, 5, 8, 13, 21, ...
• Crie uma classe chamada Fibonacci e mande criar o método main.
• No método main implemente um programa que lê um número do teclado e em seguida imprime a seqüência de Fibonacci até o n-esimo número.
*/

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        while(Fibonacci.fibo(i) <= num){
            System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
            i++;
        }

        sc.close();
    }

    static long fibo(int n){
        if (n < 2){
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
