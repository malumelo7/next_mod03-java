import java.util.ArrayList;

public class Continente {
    ArrayList<Pais> paises;
    private String nome;

    Continente(String nome){
        this.paises = new ArrayList<Pais>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionaPais(Pais pais){
        paises.add(pais);
    }

    public double getDimensaoContinente(Continente continente){
        double soma = 0.0;
        for (Pais pais : paises) {
            soma += pais.getDimensao();
        }
        return soma;
    }
    
    public int getPopulacaoContinente(Continente continente){
        int soma = 0;
        for (Pais pais : paises) {
            soma+= pais.getPopulacao();
        }
        return soma;
    }

    public double getDensidadePopulacional(Continente continente){
        return continente.getPopulacaoContinente(continente)/continente.getDimensaoContinente(continente);
    }

    public Pais getPaisMaiorPopulacao(Continente continente){
        Pais paisMaiorPopulacao = new Pais("nome", 1.0, Integer.MIN_VALUE);
        for (Pais pais : paises) {
            if(pais.getPopulacao() > paisMaiorPopulacao.getPopulacao()){
                paisMaiorPopulacao = pais;
            }
        }
        
        return paisMaiorPopulacao;
    }

    public Pais getPaisMenorPopulacao(Continente continente){
        Pais paisMenorPopulacao = new Pais("nome", 1.0, Integer.MAX_VALUE);
        for (Pais pais : paises) {
            if(pais.getPopulacao() < paisMenorPopulacao.getPopulacao()){
                paisMenorPopulacao = pais;
            }
        }
        
        return paisMenorPopulacao;
    }

    public Pais getPaisMenorDimensao(Continente continente){
        Pais paisMenorDimensao = new Pais("nome", 1.0, Integer.MAX_VALUE);
        for (Pais pais : paises) {
            if(pais.getPopulacao() < paisMenorDimensao.getPopulacao()){
                paisMenorDimensao = pais;
            }
        }
        
        return paisMenorDimensao;
    }

    public Pais getPaisMaiorDimensao(Continente continente){
        Pais paisMaiorDimensao = new Pais("nome", 1.0, Integer.MIN_VALUE);
        for (Pais pais : paises) {
            if(pais.getPopulacao() > paisMaiorDimensao.getPopulacao()){
                paisMaiorDimensao = pais;
            }
        }
        
        return paisMaiorDimensao;
    }

    public double getRazaoMaiorMenorDimensao(Continente continente){
        return continente.getPaisMaiorDimensao(continente).getDimensao()/continente.getPaisMenorDimensao(continente).getDimensao();
    }
}