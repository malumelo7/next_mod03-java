import java.util.Scanner;
/**
6) Altere o programa da questão 4 para informar se o aluno está aprovado,
reprovado ou na final. Considere
7 a 10 aprovado
4 a 6,9 final
0 a 3,9 reprovado
 */
public class AnalisaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int PESO_1 = 4;
        final int PESO_2 = 7;


        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double media = (PESO_1*nota1 + PESO_2*nota2)/11;
        sc.close();
        if(media <= 3.9 && media >= 0.0){
            System.out.println("Reprovado");
        } else if(media >= 4.0 && media <= 6.9){
            System.out.println("Final");
        } else{
            System.out.println("Aprovado");
        }
    }
}
