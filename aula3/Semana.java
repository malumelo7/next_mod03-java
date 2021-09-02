import java.util.Scanner;

/**
 * Usando as iniciais de dia da semana (d,s,t,q) imrpima os dias que comecam a lestra recebida.
 */



public class Semana {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String dia = sc.nextLine().toLowerCase();
    
    switch (dia) {
        case "d":
            System.out.println("Domingo");
            break;
        
        case "s":
            System.out.println("Segunda, Sexta e Sábado");
            break;
        
        case "t":
            System.out.println("Terça");
            break;

        case "q":
            System.out.println("Quarta e quinta");
    
        default:
            break;
    }
    sc.close();
}

    
}