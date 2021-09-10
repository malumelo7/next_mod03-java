import java.util.Scanner;
/*
Read 3 floating-point numbers. After, print the roots of bhaskara’s formula. If it's impossible to calculate the roots because a division by zero or a square root of a negative number, presents the message “Impossivel calcular”.
Input

Read 3 floating-point numbers (double) A, B and C.
Output

Print the result with 5 digits after the decimal point or the message if it is impossible to calculate.

Input Samples 	Output Samples

10.0 20.1 5.1   R1 = -0.29788
                R2 = -1.71212
	
0.0 20.0 5.0    Impossivel calcular
	
10.3 203.0 5.0  R1 = -0.02466
                R2 = -19.68408
	
10.0 3.0 5.0    Impossivel calcular
 */
public class BhaskarasFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String valuesString[] = sc.nextLine().split(" ");
        Double[] valuesDouble = new Double[valuesString.length];
        
        for (int i = 0; i < valuesString.length; i++) {
            valuesDouble[i] = Double.parseDouble(valuesString[i]);
        }
        double delta = Math.pow(valuesDouble[1], 2) - 4*valuesDouble[0]*valuesDouble[2];

        if(delta > 0 && valuesDouble[0] != 0){
            double r1 = (- valuesDouble[1] + Math.pow(delta, 0.5))/(2*valuesDouble[0]);
            double r2 = (- valuesDouble[1] - Math.pow(delta, 0.5))/(2*valuesDouble[0]);

            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);

        } else{
            System.out.println("Impossivel calcular");
        }
        sc.close();
    }
}
