import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * Read an integer number that is the code number for phone dialing. Then, print the destination according to the following table:
 
DDD     Destination
61      Brasilia
71      Salvador
11      Sao Paulo
21      Rio de Janeiro
32      Juiz de Fora
19      Campinas
27      Vitoria
31      Belo Horizonte

If the input number isn’t found in the above table, the output must be:
DDD nao cadastrado
That means “DDD not found” in Portuguese language.

Input

The input consists in a unique integer number.

Output

Print the city name corresponding to the input DDD. Print DDD nao cadastrado if doesn't exist corresponding DDD to the typed number.


Input Sample 	Output Sample

11              Sao Paulo
	



 */
public class DDD {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<Integer, String>();
        db.put(61, "Brasilia");
        db.put(71,"Salvador");
        db.put(11, "Sao Paulo");
        db.put(21, "Rio de Janeiro");
        db.put(32, "Juiz de Fora");
        db.put(19, "Campinas");
        db.put(27, "Vitoria");
        db.put(31, "Belo Horizonte");

        Scanner sc = new Scanner(System.in);

        int ddd = sc.nextInt();
        if(db.get(ddd)== null){
            System.out.println("DDD nao cadastrado");
        } else{
            System.out.println(db.get(ddd));
        }
        sc.close();
    }
}
