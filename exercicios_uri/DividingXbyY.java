import java.util.Scanner;
/*
Write a program that read two numbers X and Y and print the result of dividing the X by Y. If it's not possible, print the message "divisao impossivel".
Input

The input contains an integer number N. This N is the quantity of pairs of integer numbers X and Y read (dividend and divisor).
Output

For each test case print the result of this division with one digit after the decimal point, or “divisao impossivel” if it isn't possible to perform the calculation.

Obs.: Be carefull. The division between two integers in some languages generates another integer. Use cast:)
Input Sample 	Output Sample

3
3 -2            -1.5
-8 0            divisao impossivel
0 8             0.0
 */
public class DividingXbyY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int quantidade = sc.nextInt();
        String[] saida = new String[quantidade];

        for (int i = 0; i < quantidade; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b == 0){
                saida[i] = "divisao impossivel";
            } else {
                Double divisao = (double) a/b;
                saida[i] = String.format("%.1f", divisao);
            }
        }

        for (int i = 0; i < saida.length; i++) {
            System.out.println(saida[i]);
        }
        sc.close();
    }
}
