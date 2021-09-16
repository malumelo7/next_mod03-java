/*
07. Escreva em Java uma classe Continente. Um continente possui um nome e é composto
por um conjunto de países. Forneça os membros de classe a seguir:
a) Construtor que inicialize o nome do continente;
b) Um método que permita adicionar países aos continentes;
c) Um método que retorne a dimensão total do continente;
d) Um método que retorne à população total do continente;
e) Um método que retorne à densidade populacional do continente;
f) Um método que retorne o país com maior população no continente;
g) Um método que retorne o país com menor população no continente;
h) Um método que retorne o país de maior dimensão territorial no continente;
i) Um método que retorne o país de menor dimensão territorial no continente;
j) Um método que retorne a razão territorial do maior país em relação ao
menor país.
 */
public class App {
    public static void main(String[] args) throws Exception {
        //a) Construtor que inicialize o nome do continente;
        Continente continente = new Continente("África");

        //b) Um método que permita adicionar países aos continentes;
        Pais pais1 = new Pais("Nigéria", 20.52, 20);
        Pais pais2 = new Pais("Africa do Sul", 79.48, 40);

        continente.adicionaPais(pais1);
        continente.adicionaPais(pais2);

        //c) Um método que retorne a dimensão total do continente;
        System.out.println(continente.getDimensaoContinente(continente)); 

        //d) Um método que retorne à população total do continente;
        System.out.println(continente.getPopulacaoContinente(continente));

        //e) Um método que retorne à densidade populacional do continente;
        System.out.println(continente.getDensidadePopulacional(continente));
        
        //f) Um método que retorne o país com maior população no continente;
        System.out.println(continente.getPaisMaiorPopulacao(continente).getNome());
    
        //g) Um método que retorne o país com menor população no continente;
        System.out.println(continente.getPaisMenorPopulacao(continente).getNome());

        //h) Um método que retorne o país de maior dimensão territorial no continente;
        System.out.println(continente.getPaisMaiorDimensao(continente).getNome());

        //i) Um método que retorne o país de menor dimensão territorial no continente;
        System.out.println(continente.getPaisMenorDimensao(continente).getNome());

        //j) Um método que retorne a razão territorial do maior país em relação ao
        //menor país.
        System.out.println(continente.getRazaoMaiorMenorDimensao(continente));
    }
}
