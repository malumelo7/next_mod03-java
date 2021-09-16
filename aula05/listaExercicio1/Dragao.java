/*
02. Você conhece o Balerion? Balerion era o dragão, chamado também de Terror Negro.
Pertencia originalmente ao Aegon Conquistador, da casa Targaryen, ambos nasceram
em Valíria. Crie uma classe em Java que pode representar o Balerion. Considerando as
informações que você tem, insira os atributos e métodos (ações).
 */
public class Dragao {
    private String nome;
    private String apelido;
    private String tutor;
    private String cidadeNascimentoDono;
    private String familia;
    private String cidadeNascimentoAnimal;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return this.apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getTutor() {
        return this.tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getCidadeNascimentoDono() {
        return this.cidadeNascimentoDono;
    }

    public void setCidadeNascimentoDono(String cidadeNascimentoDono) {
        this.cidadeNascimentoDono = cidadeNascimentoDono;
    }

    public String getFamilia() {
        return this.familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getCidadeNascimentoAnimal() {
        return this.cidadeNascimentoAnimal;
    }

    public void setCidadeNascimentoAnimal(String cidadeNascimentoAnimal) {
        this.cidadeNascimentoAnimal = cidadeNascimentoAnimal;
    }

    public void soltarFogo(){
        System.out.println("DRACARYS!");
    }

    public double ganhaVida(){
        return 10.0;
    }

    public static void main(String[] args) {
        Dragao dragao = new Dragao();

        dragao.setNome("Balerion");
        dragao.setApelido("Terror Negro");
        dragao.setTutor("Aegon Conquistador");
        dragao.setFamilia("Targaryen");
        dragao.setCidadeNascimentoAnimal("Valíria");
        dragao.setCidadeNascimentoDono("Valíria");

    }
}
