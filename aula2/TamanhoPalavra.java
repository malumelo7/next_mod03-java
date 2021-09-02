import java.util.Scanner;

public class TamanhoPalavra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavra = sc.nextLine();

        int lenPalavra = palavra.length();

        System.out.println(lenPalavra);

        sc.close();
    }
}
