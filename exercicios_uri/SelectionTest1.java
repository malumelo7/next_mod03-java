import java.util.Scanner;
/**
Read 4 integer values A, B, C and D. Then if B is greater than C and D is greater than A and if the sum of C and D is greater than the sum of A and B and if 
C and D were positives values and if A is even, write the message “Valores aceitos” (Accepted values). 
Otherwise, write the message “Valores nao aceitos” (Values not accepted).
Input

Four integer numbers A, B, C and D.
Output

Show the corresponding message after the validation of the values​​.

Input Sample 	Output Sample

5 6 7 8         Valores nao aceitos
	
2 3 2 6         Valores aceitos
 */

public class SelectionTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String valuesString[] = sc.nextLine().split(" ");
        Integer valuesInt[] = new Integer[valuesString.length];
        
        for (int i = 0; i < valuesString.length; i++) {
            valuesInt[i] = Integer.parseInt(valuesString[i]);
        }

        if(valuesInt[1] > valuesInt[2] && valuesInt[3] > valuesInt[0] && (valuesInt[2] + valuesInt[3] > valuesInt[0] + valuesInt[1]) && valuesInt[2] > 0 && valuesInt[3] > 0 && valuesInt[0]%2 == 0){
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
        sc.close();
    }
}
