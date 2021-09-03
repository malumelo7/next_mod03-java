import java.util.Scanner;

/**
 * Faça uma agenda telefônica usando arrays. Você vai armazenar o número da pessoa em um array e o nome dela em outro. Pedirá ao usuário para inserir o nome da pessoa então retornará o número dela. O usuário pode inserir o nome com lower ou upper case, isso não fará diferença. 
 */
public class ListaTelefonica {
    public static void main(String[] args) {
        String[] telefones = {"(81) 99999-9999", "(91) 88888-8888", "(81) 77777-7777"};
        String[] nomes = {"Luffy", "Zoro", "Jinbe"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nomeProcurado = sc.nextLine().toLowerCase();

        for (int i = 0; i < nomes.length; i++) {
            if(nomes[i].toLowerCase().equals(nomeProcurado)){
                System.out.println("Nome localizado: " + nomes[i] + "\n" + "Telefone: "+ telefones[i]);
                break;
            }
        }
        sc.close();
    }
}
