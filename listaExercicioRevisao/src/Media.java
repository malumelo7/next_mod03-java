import java.util.Scanner;
/**
4) Escreva um programa JAVA que calcula a média ponderada de 2
números. Sabendo que o peso da nota 1 é 4 e o peso da nota 2 é 7. Use
constantes.
Leia as notas do teclado
Nota1 MUL peso1 SUM Nota2 MUL peso2 DIV peso1 SUM peso2
 */
public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int PESO_1 = 4;
        final int PESO_2 = 7;


        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double media = (PESO_1*nota1 + PESO_2*nota2)/11;
        System.out.println(media);
        sc.close();
    }
}
