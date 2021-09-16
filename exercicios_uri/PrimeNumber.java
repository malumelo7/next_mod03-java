import java.util.Scanner;

/**
A Prime Number is a number that is divisible only by 1 (one) and by itself. For example the number 7 is Prime, because it can be divided only by 1 and by 7.
Input

The input contains several test cases. The first contains the number of test cases N (1 ≤ N ≤ 100). Each one of the following N lines contains an integer X (1 < X ≤ 107), that can be or not a prime number.
Output

For each test case print the message “X eh primo” (X is prime) or “X nao eh primo” (X isn't prime) according with to above specification.

Input Sample 	Output Sample

3
8
51
7
	

8 nao eh primo
51 nao eh primo
7 eh primo
 */

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdNumbers = sc.nextInt();
        
        for (int i = 0; i < qtdNumbers; i++) {
            int number = sc.nextInt();
            IsPrime(number);
        }
        sc.close();
    }

    private static void IsPrime(int number) {
        boolean ehPrimo = true;
        if (number > 1){
            for (int i = 2; i < number; i++) {
                if (number%i == 0){
                    ehPrimo = false;
                    break;
                }
            }
            if(ehPrimo){
                System.out.println(number + " eh primo");
            } else{
                System.out.println(number + " nao eh primo");
            }
        }
    }
}
