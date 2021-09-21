public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Testando as classes");

        IngressoVIP ingressoMelhor = new IngressoVIP(100.0, 120.0);
        System.out.println(ingressoMelhor.toString());

        Ingresso ingresso = new Ingresso(10.0);  
        
        System.out.println(ingresso.toString());
    }
}
