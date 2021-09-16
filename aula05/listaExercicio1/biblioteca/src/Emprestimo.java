/**
 05. Faça um programa para controle de empréstimo de livros, com as classes Emprestimo,
Livro e Pessoa
 */
public class Emprestimo {
    Livro livro;
    Pessoa pessoa;
    
    public void realizaEmprestimo(Livro livro, Pessoa pessoa){
        livro.setEmEstoque(false);
    }

    public void devolveEmprestimo(Livro livro, Pessoa pessoa){
        livro.setEmEstoque(true);
    }
}