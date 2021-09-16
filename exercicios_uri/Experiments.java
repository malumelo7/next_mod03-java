import java.util.Scanner;
/**
Maria has just started as graduate student in a medical school and she's needing your help to organize a laboratory experiment which she is responsible about. She wants to know, at the end of the year, how many animals were used in this laboratory and the percentage of each type of animal is used at all.

This laboratory uses in particular three types of animals: frogs, rats and rabbits. To obtain this information, it knows exactly the number of experiments that were performed, the type and quantity of each animal is used in each experiment.
Input

The first line of input contains an integer N indicating the number of test cases that follows. Each test case contains an integer Amount (1 ≤ Amount ≤ 15) which represents the amount of animal used and a character Type ('C', 'R' or 'S'), indicating the type of animal:
- C: Coelho (rabbit in portuguese)
- R: Rato (rat  in portuguese)
- S: Sapo (frog in portuguese)
Output

Print the total of animals used, the total of each type of animal and the percentual of each one in relation of the total of animals used. The percentual must be printed with 2 digits after the decimal point.

Input Sample 	

10
10 C
6 R
15 S
5 C
14 R
9 C
6 R
8 S
5 C
14 R
	
Output Sample

Total: 92 cobaias
Total de coelhos: 29
Total de ratos: 40
Total de sapos: 23
Percentual de coelhos: 31.52 %
Percentual de ratos: 43.48 %
Percentual de sapos: 25.00 %

 */
public class Experiments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //quantidade de experimentos no ano
        int qtdExperiments = sc.nextInt();
        String[] experiment = new String[2];
    
        //Contadores
        Integer qtdCoelho = 0;
        Integer qtdRato = 0;
        Integer qtdSapo = 0;
        Integer qtdTotal = 0;

        sc.nextLine();
        for (int i = 0; i < qtdExperiments; i++) {
            experiment = sc.nextLine().split(" ");
            
            String qtd = experiment[0];
            String tipo = experiment[1];

            int qtdInt = Integer.parseInt(qtd);
    
            switch (tipo) {
                case "R":
                    qtdRato += qtdInt;
                    qtdTotal += qtdInt;
                    break;

                case "C":
                    qtdCoelho += qtdInt;
                    qtdTotal += qtdInt;
                    break;
                case "S":
                    qtdSapo += qtdInt;
                    qtdTotal += qtdInt;
                    break;
                default:
                    break;
            }

        }

        double percCoelho = ((double)qtdCoelho/(double)qtdTotal)*100.00;
        double percRato = ((double)qtdRato/(double)qtdTotal)*100.00;
        double percSapo = ((double)qtdSapo/(double)qtdTotal)*100.00;

        System.out.println("Total: " + qtdTotal + " cobaias");
        System.out.println("Total de coelhos: " + qtdCoelho);
        System.out.println("Total de ratos: " + qtdRato);
        System.out.println("Total de sapos: " + qtdSapo);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percCoelho);
        System.out.printf("Percentual de ratos: %.2f %%\n", percRato);
        System.out.printf("Percentual de sapos: %.2f %%\n", percSapo);

        sc.close();
    }
}