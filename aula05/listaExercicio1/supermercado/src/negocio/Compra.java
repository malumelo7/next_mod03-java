package supermercado.src.negocio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import supermercado.src.dados.Item;
import supermercado.src.dados.Pedido;
import supermercado.src.dados.Produto;

/* 03. Identifique as classes e implemente um programa para a seguinte especificação: “O
supermercado vende diferentes tipos de produtos. Cada produto tem um preço e uma
quantidade em estoque. Um pedido de um cliente é composto de itens, onde cada
item especifica o produto que o cliente deseja e a respectiva quantidade. Esse pedido
pode ser pago em dinheiro, cheque ou cartão.”
*/
public class Compra {
    public static void main(String[] args) {
        fazerCompra();
    }

    public static void fazerCompra(){
        //Estoque
        Produto produto01 = new Produto(1234, "Café", 10, 25.00);
        Produto produto02 = new Produto(5678,"Chá", 12, 5.00);

        //Lista de itens do pedido
        ArrayList<Item> itens = new ArrayList<Item>();
        itens.add(new Item(produto01, 1));
        itens.add(new Item(produto02, 1));
        
        boolean podeComprar = verificaListaEstoque(itens);
        
        if(podeComprar) {
            //Pedido
            Pedido pedido = new Pedido();
            pedido.setItens(itens);

            double totalPedido = calcularCompra(pedido);

            System.out.println("O total do seu pedido é: " + totalPedido);
            System.out.println("Digite a forma de pagamento: ");

            Scanner sc = new Scanner(System.in);
            String formaPagamento = sc.nextLine();
            System.out.println("Compra executada com sucesso. Usando o método de pagamento " 
                + formaPagamento + ".");
            sc.close();
        } else{ 
            System.out.println("No seu pedido, existem itens sem estoque. Volte mais tarde.");
        }

    }

    public static double calcularCompra(Pedido pedido){
        List<Item> listaCompras = pedido.getItens();
        double totalCompra = 0.0;

        for (Item item : listaCompras) {
            double valorProduto = item.getProduto().getPreco();
            double quantidadeItem = item.getQuantidade();

            totalCompra += (valorProduto*quantidadeItem);
        }
        return totalCompra;
    }

    public static boolean verificarEstoque(Item item) {
        boolean disponivel = false;

        if(item.getProduto().getQuantidadeEmEstoque() >= item.getQuantidade()){
            disponivel = true;
        }
        return disponivel;
    }

    public static boolean verificaListaEstoque(List<Item> itens){
        boolean podeComprar = true;

        for (Item item : itens) {
            if(!verificarEstoque(item)){
                podeComprar = false;
                break;
            }
        }
        return podeComprar;
    }
}
