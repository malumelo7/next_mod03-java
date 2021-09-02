import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Raio: ");
        double raio = sc.nextDouble();
        
        double area = 3.14159*Math.pow(raio, 2);

        System.out.printf("A área é: " + "%.4f\n", area);
        
        if (raio > 3.5){
            double circunferencia = 2*3.14159*raio;
            System.out.printf("A circunferência é:" + "%.4f", circunferencia);
        }
        sc.close();
    }
}
