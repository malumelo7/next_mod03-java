/**
• Crie uma classe chamada Comparacao e mande criar o método main.
• No método main implemente um programa que possui três variáveis locais: x, y e z e em seguida imprime os números em ordem crescente.
 */
public class Comparacao {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        int z = 11;
        
        if(x > y){
            if(y > z){
                System.out.println(z + "" + y + "" + x);
            } else{
                System.out.println(y + "" + z + "" + x);
            }
        }
        else if(z > y){
            if(y > x){
                System.out.println(x + "" + y + "" + z);
            } else{
                System.out.println(y + "" + x + "" + z);
            }
        }
        else if(y > x){
            if(x > z){
                System.out.println(z + "" + x + "" + y);
            } else{
                System.out.println(x + "" + z + "" + y);
            }
        }
    }
}
