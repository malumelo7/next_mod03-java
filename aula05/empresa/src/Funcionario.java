/**
 * Funcionario
 */
public class Funcionario {

    private String nome;
    private String funcao;
    
    private Funcionario gerente;
    
    private static double aumentoColetivo;
    private double aumentoMerito;

    public static void alterarSalario(){

    }

    public static void main(String[] args) {
        Funcionario funcionarioJose = new Funcionario();
        Funcionario funcionarioGerente = new Funcionario();

        funcionarioJose.gerente = funcionarioGerente;

        Funcionario.aumentoColetivo = 5.0;

        
    }
}