package supermercado.src.dados;
import java.util.*;

public class Estoque {
    public List<Produto> estoque = new ArrayList<Produto>();


    private void adicionaProduto(Produto produto){
        estoque.add(produto);
    }

    private void removeProduto(Produto produto){
        estoque.remove(produto);
    }
    void exibeEstoque(){
        for (Produto produto : estoque) {
            System.out.println(produto);
        }
    }

    


}
