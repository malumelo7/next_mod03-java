import java.util.Scanner;

/**
Read an integer N and compute all its divisors.
Input

The input file contains an integer value.
Output

Write all positive divisors of N, one value per line.
Input Sample 	
6
	
Output Sample
1
2
3
6
*/
public class DivisorsI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
