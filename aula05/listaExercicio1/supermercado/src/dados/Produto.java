package supermercado.src.dados;

import javax.swing.JOptionPane;

public class Produto {
    
    private final int codigo;
    private String nome;
    private int quantidadeEmEstoque;
    private double preco;

    public int getCodigo() {
		return this.codigo;
	}

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEmEstoque() {
        return this.quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(int codigo, String nome, int quantidadeEmEstoque, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.preco = preco;
    }

    public void exibirProduto(){
        JOptionPane.showMessageDialog(null, "Nome do produto: " + nome + "\nQuantidade: " + quantidadeEmEstoque + "\nPreço: " + preco);
    }
}
