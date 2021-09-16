public class Pais {
    private String nome;
    private double dimensao;
    private int populacao;

    Pais(String nome, double dimensao, int populacao){
        this.nome = nome;
        this.dimensao = dimensao;
        this.populacao = populacao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDimensao() {
        return this.dimensao;
    }

    public void setDimensao(int dimensao) {
        this.dimensao = dimensao;
    }

    public int getPopulacao() {
        return this.populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }
    
}