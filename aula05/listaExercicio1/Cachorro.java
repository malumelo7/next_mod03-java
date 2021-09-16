/**
01. Faça uma classe que represente alguma coisa aleatória na sua casa (liquidificador,
cachorro, pessoa). Adicione atributos nela, faça pelo menos 4 atributos. Escreva
métodos para a classe, pelo menos 2 métodos devem ser alterando atributo.
 */
public class Cachorro {
    String nome;
    int idade;
    double peso;
    double tamanho;

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

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    Cachorro(String nome, int idade, double peso, double tamanho){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.tamanho = tamanho;
    }
    
    void adicionaIdade() {
        idade= idade + 1;
    }

    void alteraPeso(int novoPeso){
        peso = novoPeso;
    }

    static void latirBaixo(){
        System.out.println("au au!");
    }
    
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("flip", 5, 4, 80);

        cachorro.adicionaIdade();
        cachorro.alteraPeso(7);

        Cachorro.latirBaixo();

        System.out.println(cachorro.idade);
        System.out.println(cachorro.peso);
    }

    
}