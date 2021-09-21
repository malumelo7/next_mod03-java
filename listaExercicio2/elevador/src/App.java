public class App {
    public static void main(String[] args) throws Exception {
        //Testando métodos elevador

        Elevador elevador = new Elevador();

        elevador.inicializa(5, 3);

        elevador.sobe();
        elevador.sobe();
        elevador.sobe();

        elevador.andarAtual();

        elevador.entra();
        elevador.entra();
        elevador.sai();
        
        elevador.andarAtual();
        System.out.println(elevador.getPessoasPresentes());

        
    }
}
