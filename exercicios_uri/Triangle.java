import java.util.Arrays;
import java.util.Scanner;

/*
Read three point floating values (A, B and C) and verify if is possible to make a triangle with them. If it is possible, calculate the perimeter of the 
triangle and print the message:


Perimetro = XX.X


If it is not possible, calculate the area of the trapezium which basis A and B and C as height, and print the message:


Area = XX.X
Input

The input file has tree floating point numbers.
Output

Print the result with one digit after the decimal point.

Input Sample 	Output Sample

6.0 4.0 2.0     Area = 10.0
	
6.0 4.0 2.1     Perimetro = 12.1
 */
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String valuesString[] = sc.nextLine().split(" ");
        Double[] valuesDouble = new Double[valuesString.length];
        Double[] lados = new Double[valuesString.length];
        
        
        for (int i = 0; i < valuesString.length; i++) {
            valuesDouble[i] = Double.parseDouble(valuesString[i]);
            lados[i] = Double.parseDouble(valuesString[i]);
        }
        
        Arrays.sort(valuesDouble);


        if(valuesDouble[0] + valuesDouble[1] > valuesDouble[2]){
            Double perimetro = valuesDouble[0] + valuesDouble[1] + valuesDouble[2];
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else{
            Double area = ((lados[0] + lados[1])*lados[2])/2;
            System.out.printf("Area = %.1f\n", area);
        }
        sc.close();
    }
}
