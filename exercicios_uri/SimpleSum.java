import java.util.Scanner;

/**
Input
The input file contains 2 integer numbers.

Output
Print the message "SOMA" with all the capital letters, with a blank space before and after the equal signal followed by the corresponding value to the sum of A and B. Like all the problems, don't forget to print the end of line, otherwise you will receive "Presentation Error"

Input Samples	Output Samples
30              SOMA = 40
10

-30             SOMA = -20
10

0               SOMA = 0
0
 */
public class SimpleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int soma = a + b;

        System.out.println("SOMA = "+ soma);
        sc.close();
    }
}
