public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("Malu", 591);
        Livro livro = new Livro(01, "Senhor dos Anéis", true);
        
        Emprestimo emprestimo = new Emprestimo();

        emprestimo.realizaEmprestimo(livro, pessoa);

        System.out.println(livro.isEmEstoque());
    }
}
