/**
 * Crie uma classe chamada Ingresso que possua um atributo valor e um método
 * toString que retorne à informação do valor do ingresso.
 * 
 * Crie uma classe IngressoVIP, que herda de Ingresso e possui um atributo valor
 * Adicional. O método toString da classe IngressoVIP deve considerar que o
 * valor do ingresso é o valor da superclasse somado ao valor Adicional do
 * IngressoVIP.
 * 
 * Crie uma classe para testar os objetos das classes Ingresso e IngressoVIP.
 */
public class Ingresso {
    private double valor;

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public Ingresso() {
        
    }

    public String toString() {
        return String.valueOf(this.getValor());
    }
}