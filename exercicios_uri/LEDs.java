import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
John wants to set up a panel containing different numbers of LEDs. He does not have many leds, he is not sure if he will be able to mount the desired number. Considering the configuration of the LEDs of the numbers below, make an algorithm that helps John to discover the number of LEDs needed to set the value.

Input

The input contains an integer N, (1 ≤ N ≤ 2000) corresponding to the number of test cases, followed by N lines, each line containing a number (1 ≤ V ≤ 10100) corresponding to the value that John wants to set with the leds.

Output

For each test case, print one line containing the number of LEDs that John needs to set the desired value, followed by the word "leds".
Input Sample 	

3
115380
2819311
23456
	
Output Sample

27 leds
29 leds
25 leds
 */
public class LEDs {
    public static void main(String[] args) {
        Map<String, Integer> db = new HashMap<String, Integer>();
        db.put("1", 2);
        db.put("2",5);
        db.put("3", 5);
        db.put("4", 4);
        db.put("5", 5);
        db.put("6", 6);
        db.put("7", 3);
        db.put("8", 7);
        db.put("9", 6);
        db.put("0", 6);

        Scanner sc = new Scanner(System.in);
        
        //get quantity
        int qtd = sc.nextInt();

        //get the numbers thats is going to be analysed
        String[] numbersString = new String[qtd];

        sc.nextLine();
        for (int i = 0; i < numbersString.length; i++) {
            numbersString[i] = sc.nextLine();
        }
        
        //transform into a array of chars to iterate
        String[] arrayNum = new String[numbersString.length];
        int totalLEDS = 0;
        int saida[] = new int[qtd];

        for (int i = 0; i < numbersString.length; i++) {
            arrayNum = numbersString[i].split("");
            for (String string : arrayNum) {
                totalLEDS += db.get(string);
            }
            saida[i] = totalLEDS;
            totalLEDS = 0;
        }

        for (int i : saida) {
            System.out.println(i + " leds");
        }
        sc.close();
    }
}
