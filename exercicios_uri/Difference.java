import java.util.Scanner;

/*
Read four integer values named A, B, C and D. Calculate and print the difference of product A and B by the product of C and D (A * B - C * D).

Input
The input file contains 4 integer values.

Output
Print DIFERENCA (DIFFERENCE in Portuguese) with all the capital letters, according to the following example, with a blank space before and after the equal signal. 
Input Samples	Output Samples
5               DIFERENCA = -26
6
7
8

0               DIFERENCA = -56
0
7
8

5               DIFERENCA = 86
6
-7
8
*/
public class Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int diferenca = (a*b) - (c*d);

        System.out.println("DIFERENCA = " + diferenca);
        sc.close();
    }
}
