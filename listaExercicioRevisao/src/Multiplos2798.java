/**
10) Escreva uma programa JAVA que escreve todos os números múltiplos de 3, 5, e 7 de 1 ate 2798
 */
public class Multiplos2798 {
    public static void main(String[] args) {
        for (int i = 1; i < 2799; i++) {
            if(i%3 == 0){
                System.out.println(i);
                
            } else if(i%5 ==0){
                System.out.println(i);
                
            }else if(i%7 ==0){
                System.out.println(i);
                
            } else{
                continue;
            }
        }
    }
}
