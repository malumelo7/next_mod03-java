/**
 * 1. Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de
nascimento e altura. Crie os métodos públicos necessários para sets e gets e também um
método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade
da pessoa.
 */

public class App {
    public static void main(String[] args) throws Exception {
        Human pessoa = new Human("Malu", "19-03-1998", 1.67);

        System.out.println(pessoa.getIdade(pessoa));
        pessoa.exibeHumano(pessoa);
    }
}
