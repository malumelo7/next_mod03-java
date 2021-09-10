import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
Read an integer number between 1 and 12, including. Corresponding to this number, you must print the month of the year, in english, with the first letter in uppercase.
Input

The input contains only an integer number.
Output

Print the name of the month according to the input number, with the first letter in uppercase.

Input Sample 	Output Sample

4               April
 */
public class Month {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<Integer, String>();
        db.put(1, "January");
        db.put(2,"February");
        db.put(3, "March");
        db.put(4, "April");
        db.put(5, "May");
        db.put(6, "June");
        db.put(7, "July");
        db.put(8, "August");
        db.put(9, "September");
        db.put(10, "October");
        db.put(11, "November");
        db.put(12, "December");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(db.get(num));
        sc.close();
    }
}
