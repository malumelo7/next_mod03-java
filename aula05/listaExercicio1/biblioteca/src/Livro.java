public class Livro {
    private final int id;
    private String nome;
    private boolean emEstoque;

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEmEstoque() {
        return this.emEstoque;
    }

    public void setEmEstoque(boolean emEstoque) {
        this.emEstoque = emEstoque;
    }

    Livro(int id, String nome, boolean emEstoque){
        this.id = id;
        this.nome = nome;
        this.emEstoque = emEstoque;
    }
}
