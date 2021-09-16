import java.util.Scanner;
/**
In mathematics, a perfect number is an integer for which the sum of all its own positive divisors (excluding itself) is equal to the number itself. For example the number 6 is perfect, because 1+2+3 is equal to 6. Your task is to write a program that read integer numbers and print a message informing if these numbers are perfect or are not perfect.
Input

The input contains several test cases. The first contains the number of test cases N (1 ≤ N ≤ 100). Each one of the following N lines contains an integer X (1 ≤ X ≤ 108), that can be or not a perfect number.
Output

For each test case print the message “X eh perfeito” (X is perfect) or “X nao eh perfeito” (X isn't perfect) according with to above specification.
Input Sample 	Output Sample

3
6
5
28
	

6 eh perfeito
5 nao eh perfeito
28 eh perfeito
 */
public class PerfectNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int quantidade = sc.nextInt();
        String[] saida = new String[quantidade];
        
        for (int i = 1; i <= quantidade; i++) {
            int n = sc.nextInt();
            int soma = 0;
            
            for (int j = 1; j < n; j++) {
                if(n%j == 0){
                    soma += j;
                }
            }

            if(soma == n){
                saida[i - 1] = String.format("%d eh perfeito", n);
            } else{
                saida[i - 1] = String.format("%d nao eh perfeito", n);
            }
        }
        for (int i = 0; i < saida.length; i++) {
            System.out.println(saida[i]);
        }

        sc.close();
    }
}
