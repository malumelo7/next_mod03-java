import java.util.Scanner;
/**
7) Crie um programa JAVA que le três numero inteiros do teclado e classifique o
triangulo em:
 Equilatero -&gt; 3 lados iguais
 Isoceles -&gt; 2 Lados iguais e 1 diferente
 Escaleno -&gt; 3 lados diferentes
Considere que todos os valores lidos foram um triangulo
 */
public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lado1 = sc.nextInt();
        int lado2 = sc.nextInt();
        int lado3 = sc.nextInt();

        if(lado1 == lado2 && lado2 == lado3){
            System.out.println("Equilátero");
        } else if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3){
            System.out.println("Escaleno");
        } else{
            System.out.println("Isóceles");
        }
        sc.close();
    }
}
