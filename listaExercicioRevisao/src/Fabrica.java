import java.util.Scanner;

/**
1) O custo de um carro novo ao consumidor é a soma do custo de fábrica
com a porcentagem do distribuidor e dos impostos (aplicados ao custo de
fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de
45%, escrever um programa JAVA para ler o custo de fábrica de um carro,
calcular e escrever o custo final ao consumidor.
 */

 public class Fabrica {
     private static final double porcentagemDistribuidor = 0.28;
     private static final double porcentagemImpostos = 0.45;

    public static void main(String[] args) {
        double custoCarro = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Informe o custo de fábrica do carro: ");
            custoCarro = sc.nextDouble();
        } while (custoCarro <= 0);

        double custoTotal = custoCarro * (1 + porcentagemDistribuidor + porcentagemImpostos);

        System.out.printf("O custo total é: R$ %.2f", custoTotal);
        sc.close();
     }
 }