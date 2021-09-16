/**
 * 06. Faça um programa para representar a árvore genealógica de uma família. Para tal, crie
uma classe Pessoa que permita indicar, além de nome e idade, o pai e a mãe. Tenha em
mente que pai e mãe também são do tipo Pessoa.
 */
public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa getPai() {
        return this.pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return this.mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

}
