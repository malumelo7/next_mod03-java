import java.util.Scanner;
/**
Make a program that reads 3 integer values and present the greatest one followed by the message "eh o maior". Use the following formula:

Input

The input file contains 3 integer values.
Output

Print the greatest of these three values followed by a space and the message “eh o maior”.
Input Samples 	Output Samples

7 14 106        106 eh o maior
	
217 14 6        217 eh o maior
 */

public class TheGreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String values[] = sc.nextLine().split(" ");

        int maiorAB = (Integer.parseInt(values[0]) + Integer.parseInt(values[1]) + Math.abs(Integer.parseInt(values[0]) - Integer.parseInt(values[1])))/2;
        int maiorBC = (maiorAB + Integer.parseInt(values[2]) + Math.abs(maiorAB - Integer.parseInt(values[2])))/2;
        
        System.out.printf("%d eh o maior\n", maiorBC);
        sc.close();
        
    }
}
