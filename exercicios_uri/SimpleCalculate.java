import java.util.Scanner;

/**
In this problem, the task is to read a code of a product 1, the number of units of product 1, the price for one unit of product 1, the code of a product 2, the number of units of product 2 and the price for one unit of product 2. After this, calculate and show the amount to be paid.
Input

The input file contains two lines of data. In each line there will be 3 values: two integers and a floating value with 2 digits after the decimal point.
Output

The output file must be a message like the following example where "Valor a pagar" means Value to Pay. Remember the space after ":" and after "R$" symbol. The value must be presented with 2 digits after the point.
Input Samples 	Output Samples

12 1 5.30       VALOR A PAGAR: R$ 15.50
16 2 5.10

13 2 15.30      VALOR A PAGAR: R$ 51.40
161 4 5.20
	
1 1 15.10       VALOR A PAGAR: R$ 30.20
2 1 15.10
 */
public class SimpleCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String product1[] = sc.nextLine().split(" ");
        String product2[] = sc.nextLine().split(" ");

        double valorTotal = Integer.parseInt(product1[1])*Double.parseDouble(product1[2]) + Integer.parseInt(product2[1])*Double.parseDouble(product2[2]);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
        sc.close();
    }
}
