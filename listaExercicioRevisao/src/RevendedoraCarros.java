import java.util.Scanner;

/**
2) Uma revendedora de carros usados paga a seus funcionários vendedores
um salário fixo por mês, mais uma comissão também fixa para cada carro
vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um
programa JAVA que leia o número de carros por ele vendidos, o valor total de
suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e
escreva o salário final do vendedor.
 */
public class RevendedoraCarros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numeroCarrosVendidos = 0;
        do {
            try{
                System.out.println("Informe o número de carros vendidos: ");
                numeroCarrosVendidos = sc.nextInt();
            } catch (Exception exception){
                System.out.println("Você forneceu um valor inválido. Por favor, informe novamente.");
            } finally {
                sc.close();
            }
        } while(numeroCarrosVendidos < 0);
        
        


        double valorTotalVendas = sc.nextDouble();
        double salarioFixo = sc.nextDouble();
        double valorRecebidoCarroVendido = sc.nextDouble();

        double salarioFinal = salarioFixo + numeroCarrosVendidos*valorRecebidoCarroVendido + 0.05*valorTotalVendas;
        
        System.out.printf("O salário é: R$ %.2f", salarioFinal);
        sc.close();
    }
}
