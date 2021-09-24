import java.util.Scanner;
/**
3) Escreva um programa JAVA para ler uma temperatura em graus
Fahrenheit, calcular e escrever o valor correspondente em graus Celsius
(baseado na fórmula abaixo): C / 5 = F – 32 / 9
Observação: Para testar se a sua resposta está correta saiba que 100 C = 212F
 */

public class ConversorTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temperaturaFahrenheit = sc.nextDouble();

        double temperaturaCelsius = (5*(temperaturaFahrenheit - 32))/9;

        System.out.println(temperaturaCelsius);
        sc.close();
    }
}
